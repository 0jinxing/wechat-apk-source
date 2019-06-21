package com.tencent.mm.plugin.wallet_ecard.b;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.protocal.protobuf.aur;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.protocal.protobuf.hb;
import com.tencent.mm.protocal.protobuf.wx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

final class b$d extends g
{
  com.tencent.mm.ui.widget.a.c gLj;

  public b$d(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  final void a(aur paramaur, TextView paramTextView)
  {
    AppMethodBeat.i(48092);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if ((paramaur.wyP != null) && (!bo.isNullOrNil(paramaur.wyP.desc)))
    {
      localSpannableStringBuilder.append(paramaur.wyP.desc);
      if (!bo.isNullOrNil(paramaur.wyP.color))
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(paramaur.wyP.color)), 0, localSpannableStringBuilder.length(), 18);
    }
    if ((paramaur.wyQ != null) && (!bo.isNullOrNil(paramaur.wyQ.desc)))
    {
      int i = localSpannableStringBuilder.length();
      localSpannableStringBuilder.append(paramaur.wyQ.desc);
      localSpannableStringBuilder.setSpan(new o(paramaur.wyQ.color, new b.d.1(this)), i, localSpannableStringBuilder.length(), 18);
    }
    paramTextView.setText(localSpannableStringBuilder);
    AppMethodBeat.o(48092);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(48093);
    aur localaur;
    if ((paramm instanceof d))
    {
      this.Agm.ng(1985);
      paramm = (d)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.tQi.kdT == 0)
          if (paramm.tQi.wJP != null)
          {
            ab.i("MicroMsg.OpenECardProcess", "show input alert");
            localaur = paramm.tQi.wJP;
            if (this.gLj == null)
            {
              View localView = View.inflate(this.hwd, 2130969314, null);
              EditText localEditText = (EditText)localView.findViewById(2131823380);
              paramString = (TextView)localView.findViewById(2131823381);
              paramString.setClickable(true);
              paramString.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this.hwd));
              if (!bo.isNullOrNil(localaur.wyO))
                localEditText.setHint(paramm.tQi.wJP.wyO);
              c.a locala = new c.a(this.hwd);
              locala.asD(paramm.tQi.wJP.wyN);
              locala.PX(4);
              locala.fn(localView);
              if (!bo.isNullOrNil(localaur.wyS))
                locala.asJ(localaur.wyS);
              if (!bo.isNullOrNil(localaur.wyR))
                locala.asK(localaur.wyR);
              locala.a(false, new b.d.2(this, localEditText, paramm, paramString));
              locala.rc(false);
              locala.a(new b.d.3(this));
              this.gLj = locala.aMb();
              a(localaur, paramString);
              this.gLj.show();
              AppMethodBeat.o(48093);
            }
          }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      a(localaur, (TextView)this.gLj.findViewById(2131823381));
      break;
      b.n(this.tQp).putInt(a.tPL, a.tQc);
      b.o(this.tQp).putString(a.tPO, paramm.tQj);
      b.p(this.tQp).putString(a.tPP, paramm.tQk);
      b.q(this.tQp).putString(a.tPQ, paramm.tQl);
      paramString = new Bundle();
      if (paramm.tQi.vLd != null)
      {
        ab.i("MicroMsg.OpenECardProcess", "no need verify sms");
        paramString.putBoolean(a.tPW, false);
      }
      while (true)
      {
        try
        {
          b.r(this.tQp).putByteArray(a.tQa, paramm.tQi.vLd.toByteArray());
          this.tQp.a(this.hwd, 0, paramString);
        }
        catch (IOException paramm)
        {
          ab.printErrStackTrace("MicroMsg.OpenECardProcess", paramm, "", new Object[0]);
          continue;
        }
        ab.i("MicroMsg.OpenECardProcess", "need verfiy sms");
        paramString.putBoolean(a.tPW, true);
        paramString.putString(a.tPU, paramm.tQi.vLb);
        paramString.putString(a.tPV, paramm.tQi.wJO);
      }
      if ((com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQi.vLc)) || (com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQi.kdT, paramm.tQi.kdU)))
        break;
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQi.kdU, paramm.kCm, paramString });
      h.b(this.hwd, paramString, "", false);
      break;
      ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
      paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
      h.b(this.hwd, paramString, "", false);
      break;
      AppMethodBeat.o(48093);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    boolean bool = true;
    AppMethodBeat.i(48091);
    hb localhb = (hb)paramArrayOfObject[0];
    String str = b.l(this.tQp).getString(a.tPJ, "");
    if (localhb == null)
    {
      ab.w("MicroMsg.OpenECardProcess", "empty bank item");
      AppMethodBeat.o(48091);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.Agm.nf(1985);
      paramArrayOfObject = String.format("%s %s(%s)", new Object[] { localhb.nuL, localhb.kmu, localhb.vJG });
      paramArrayOfObject = new d(b.b(this.tQp), str, localhb.vJH, localhb.tuk, localhb.pbn, b.m(this.tQp), true, 1, paramArrayOfObject);
      this.Agm.a(paramArrayOfObject, true, 1);
      AppMethodBeat.o(48091);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.d
 * JD-Core Version:    0.6.2
 */