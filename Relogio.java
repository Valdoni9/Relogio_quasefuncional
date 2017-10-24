
public class Relogio {
    private float horario;
    private String avancar;
    private int hour;
    private int minute;
    private float second;

    /**
     * @return the relogio
     */
    public float getHorario() {
        return horario;
    }

    /**
     * @return the avancar
     */
    public String getAvancar() {
        return avancar;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @return the second
     */
    public float getSecond() {
        return second;
    }

    /**
     * @param horario the relogio to set
     * @param hour
     * @param minute
     * @param second
     */
    public void setHorario(float horario,int hour, int minute, float second) {
        this.horario = horario;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * @param avancar the avancar to set
     */
    public void setAvancar(String avancar) {
        this.avancar = avancar;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(float second) {
        this.second = second;
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
}
