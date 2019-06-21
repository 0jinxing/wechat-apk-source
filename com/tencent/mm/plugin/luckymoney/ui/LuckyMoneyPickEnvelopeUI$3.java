package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.ty;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.vending.c.a;
import java.io.IOException;

final class LuckyMoneyPickEnvelopeUI$3
  implements a<Object, a.a<ty>>
{
  LuckyMoneyPickEnvelopeUI$3(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI, String paramString)
  {
  }

  private Object f(a.a<ty> parama)
  {
    AppMethodBeat.i(42903);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode) });
    if (LuckyMoneyPickEnvelopeUI.j(this.ogX) != null)
      LuckyMoneyPickEnvelopeUI.j(this.ogX).dismiss();
    Object localObject;
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", new Object[] { Integer.valueOf(((ty)parama.fsy).kCl) });
      parama = new Intent();
      localObject = LuckyMoneyPickEnvelopeUI.c(this.ogX, this.ogY);
      if (localObject == null);
    }
    try
    {
      localObject = ((atb)localObject).toByteArray();
      parama.putExtra(e.f.yfX, (byte[])localObject);
      this.ogX.setResult(-1, parama);
      this.ogX.finish();
      AppMethodBeat.o(42903);
      return null;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", localIOException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.3
 * JD-Core Version:    0.6.2
 */