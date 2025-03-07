public boolean commonEnd(int[] a, int[] b) {
  
    int firstelement=a[0];
    int secondelement=a[a.length-1];
    int secondarrayfirst=b[0];
    int secondarraysecond=b[b.length-1];
    
    
   
    
    
    if(firstelement==secondarrayfirst || secondelement==secondarraysecond){
      return true;
    }
    
    return false;
    
    
    
  }