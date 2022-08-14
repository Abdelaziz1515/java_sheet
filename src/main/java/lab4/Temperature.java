package lab4;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        value = 0;
        scale = 'c';
    }

    public Temperature(char scale){
        this.scale=scale;
        value=0;

    }
    public Temperature(double value){
        this.value=value;
        scale='c';

    }
    public Temperature(double value,char scale){
        this.scale=scale;
        this.value=value;
    }


    public  double getCelsius(){
        if (scale=='c'){
            return value;
        }
        else {
            value=5*(value-32)/9;
            return Math.round(value*10)/10;
        }
    }
    public  double getFahrenheit(){
        if (scale=='f'){
            return value;
        }
        else {
            value=(9*(value)/5)+32;
            return Math.round(value*10)/10;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setValueScale(double value,char scale){
        this.scale=scale;
        this.value=value;
    }

    @Override
    public String toString() {
        if (scale == 'c')
        {
            return String.format("%.1f degrees C = %.1f degrees F", value, getFahrenheit());
        }
        else
        {
            return String.format("%.1f degrees F = %.1f degrees C", value, getCelsius());
        }
    }
}

