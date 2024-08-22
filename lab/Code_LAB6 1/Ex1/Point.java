

class Point implements Comparable <Point> { 
  private int x, y ;
  
  Point (int x, int y){ 
    this.x = x ;
    this.y = y ;
  }

  public void display() { 
    System.out.println ( x + " " + y ) ;
  }
  
  public int compareTo (Point p) {
    if ( this.x < p.x ) {
      return -1 ;
    } else if ( this.x > p.x ) {
      return 1 ;
    } else if ( this.y < p.y ) {
      return -1 ;
    } else if ( this.y > p.y ) {
      return 1 ;
    } else {
      return 0 ;
    }
  
  }
}