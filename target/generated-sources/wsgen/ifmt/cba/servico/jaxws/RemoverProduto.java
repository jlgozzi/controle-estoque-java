
package ifmt.cba.servico.jaxws;

import ifmt.cba.vo.ProdutoVO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removerProduto", namespace = "http://servico.cba.ifmt/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removerProduto", namespace = "http://servico.cba.ifmt/")
public class RemoverProduto {

    @XmlElement(name = "arg0", namespace = "")
    private ProdutoVO arg0;

    /**
     * 
     * @return
     *     returns ProdutoVO
     */
    public ProdutoVO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(ProdutoVO arg0) {
        this.arg0 = arg0;
    }

}
