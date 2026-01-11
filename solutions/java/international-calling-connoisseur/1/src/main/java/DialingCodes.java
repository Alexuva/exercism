import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private final Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        this.codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.codes.containsKey(code) && !this.codes.containsValue(country))
            this.codes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : this.codes.entrySet()){
            if (entry.getValue().equals(country)) return entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer existingCode = this.findDialingCode(country);

        if (existingCode == null) return;
        this.codes.remove(existingCode);
        this.codes.put(code, country);
    }
}
