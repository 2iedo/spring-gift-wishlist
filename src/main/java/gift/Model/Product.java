package gift.Model;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record Product(long id,
                      @Size(max=15, message = "글자의 길이는 15를 넘을 수 없습니다.")
                      @Pattern(regexp = "^[a-zA-Z0-9가-힣 ()\\[\\]+\\-&/_]*$", message = "허용되지 않은 특수 기호((),[],+,-,&,/,_ 이외)가 있습니다.")
                      String name,
                      int price,
                      String imageUrl)
{
    @Override
    public String toString() {
        return "id : " + id + ", name : " + name + ", price : " + price + ", imageUrl : " + imageUrl;
    }
}
