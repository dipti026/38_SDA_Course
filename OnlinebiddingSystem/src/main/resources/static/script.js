document.addEventListener('DOMContentLoaded', () => {
    // Fetch Products from Backend
    fetch('/api/products')
      .then(response => response.json())
      .then(products => displayProducts(products))
      .catch(error => console.error('Error fetching products:', error));
  });
  
  function displayProducts(products) {
    const productList = document.getElementById('products');
    productList.innerHTML = '';
  
    products.forEach(product => {
      const productItem = document.createElement('li');
      productItem.textContent = `${product.name} - $${product.startPrice} (Ends: ${new Date(product.auctionEndTime).toLocaleString()})`;
      productItem.addEventListener('click', () => selectProduct(product.id));
      productList.appendChild(productItem);
    });
  }
  
  function selectProduct(productId) {
    document.getElementById('bid-section').style.display = 'block';
    
    const bidForm = document.getElementById('bid-form');
    bidForm.onsubmit = (event) => {
      event.preventDefault();
      const bidAmount = document.getElementById('bid-amount').value;
      
      const bidData = {
        amount: parseFloat(bidAmount),
        product: { id: productId },
        bidder: { id: 1 } // Example user ID, replace with actual logged-in user ID
      };
  
      // Send Bid to Backend
      fetch('/api/bids', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(bidData)
      })
      .then(response => response.json())
      .then(data => {
        alert('Bid placed successfully!');
        document.getElementById('bid-section').style.display = 'none';
      })
      .catch(error => console.error('Error placing bid:', error));
    };
  }
  