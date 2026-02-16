import { useState, useEffect } from 'react'

function Window() {
    const [width, setWidth] = useState(window.innerWidth);
    useEffect(() => {
        const handleResize = () => {
            setWidth(window.innerWidth);
        };
        window.addEventListener('resize', handleResize);
        return () => window.removeEventListener('resize', handleResize);
    },[]);// []-> called as dependency array, it ensures that the effect runs only once when the component mounts and not on every re-render. If you omit the dependency array, the effect will run after every render, which can lead to performance issues and unintended consequences.
    // dependency array is used to specify when the effect should be re-run. If you include variables in the dependency array, the effect will only re-run when those variables change. If you leave the dependency array empty, the effect will only run once when the component mounts and not on subsequent re-renders.
    // In this case, since we want to set up the event listener only once when the component mounts and clean it up when the component unmounts, we use an empty dependency array.
    // prevents memory leakage and unnecessary recrearions of the listener on every render, ensuring that the event listener is properly cleaned up when the component unmounts.
    return (
    <div>
      <h1>Window Width: {width}px</h1>
    </div>
  )
}

export default Window;
