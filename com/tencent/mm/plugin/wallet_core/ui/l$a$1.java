package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.model.p.a;
import com.tencent.mm.plugin.wallet_core.model.p.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Vector;

final class l$a$1 extends p<String>
{
  l$a$1(l.a parama)
  {
  }

  public final String a(Vector<p<String>.b> paramVector, int paramInt)
  {
    AppMethodBeat.i(47379);
    if (paramVector == null)
    {
      ab.w("MicroMsg.WalletFavorDialog", "func[getComposedKey] keyList null");
      paramVector = "";
      AppMethodBeat.o(47379);
    }
    while (true)
    {
      return paramVector;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramVector.size(); i++)
      {
        p.a locala = ((p.b)paramVector.get(i)).tzL;
        if ((i == paramInt) || (locala == p.a.tzH))
          localStringBuilder.append((String)((p.b)paramVector.get(i)).tzK + "-");
      }
      if (localStringBuilder.length() == 0)
      {
        paramVector = "0";
        AppMethodBeat.o(47379);
      }
      else
      {
        if (localStringBuilder.length() > 1)
          localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
        paramVector = localStringBuilder.toString();
        AppMethodBeat.o(47379);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.l.a.1
 * JD-Core Version:    0.6.2
 */