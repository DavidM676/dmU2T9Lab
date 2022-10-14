public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }


    public double area()
    {

     return Math.PI *radius*radius;
    }


    public double circumference()
    {
        return Math.PI*2*radius;
    }



    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings!)
       Note that this method should return a string -- it should NOT
       do any printing. This method should call your other methods!
     */
    public String getInfo()
    {
        return "Readius: "+ radius+"\n"+"Area: "+area()+"\n"+"Circumference: "+circumference()+"\n";
    }

}
