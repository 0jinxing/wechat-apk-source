package com.tencent.mm.plugin.appbrand.game.e.a;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText;
import com.tencent.mm.plugin.appbrand.game.widget.input.a.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.widget.input.d.b;
import com.tencent.mm.plugin.appbrand.widget.input.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.tools.f.a;

final class e$1
  implements Runnable
{
  e$1(e parame, s params, String paramString, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, b paramb, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130205);
    e locale = this.hsz;
    Object localObject1 = this.hsj;
    Object localObject2 = this.hsu;
    int i = this.hsv;
    boolean bool1 = this.hsw;
    boolean bool2 = this.hsx;
    b localb = this.hsy;
    int j = this.eIl;
    Object localObject3;
    if (((s)localObject1).isRunning())
    {
      localObject3 = ((s)localObject1).aun();
      if (localObject3 != null);
    }
    else
    {
      AppMethodBeat.o(130205);
      return;
    }
    float f = com.tencent.mm.bz.a.getDensity(((u)localObject3).mContext);
    com.tencent.mm.plugin.appbrand.game.widget.input.a locala = com.tencent.mm.plugin.appbrand.game.widget.input.a.cl(((u)localObject3).getContentView());
    WAGamePanelInputEditText localWAGamePanelInputEditText = locala.getAttachedEditText();
    label151: boolean bool3;
    if (!bo.isNullOrNil((String)localObject2))
    {
      localObject3 = localObject2;
      if (((String)localObject2).length() > i)
        localObject3 = ((String)localObject2).substring(0, i);
      localWAGamePanelInputEditText.setText((CharSequence)localObject3);
      localWAGamePanelInputEditText.setSelection(localWAGamePanelInputEditText.getText().length());
      if (bool1)
        break label583;
      bool3 = true;
      label159: localWAGamePanelInputEditText.setSingleLine(bool3);
      localWAGamePanelInputEditText.setMaxLength(i);
      localObject3 = p.a(localWAGamePanelInputEditText).PM(i);
      ((c)localObject3).zIx = false;
      ((c)localObject3).jeZ = f.a.zFu;
      ((c)localObject3).a(new e.2(locale, localWAGamePanelInputEditText, (s)localObject1));
      localWAGamePanelInputEditText.addTextChangedListener(new e.3(locale, (s)localObject1));
      localWAGamePanelInputEditText.setComposingDismissedListener(new e.4(locale, localWAGamePanelInputEditText, (s)localObject1));
      locala.setOnConfirmClickListener(new e.5(locale, localWAGamePanelInputEditText, (s)localObject1, bool2, locala));
      locala.setOnVisibilityChangedListener(new e.6(locale, localWAGamePanelInputEditText, (s)localObject1, locala, f, j));
      if (!bool1)
        localWAGamePanelInputEditText.setOnEditorActionListener(new e.7(locale, bool2, localWAGamePanelInputEditText, (s)localObject1));
      localObject3 = com.tencent.mm.plugin.appbrand.config.a.a.t(((s)localObject1).getRuntime().atM()).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
      localObject1 = ((s)localObject1).getRuntime().atM();
      localObject2 = locala.hur;
      j = ae.fr((Context)localObject1);
      ab.i("MicroMsg.WAGameInputPanel", "orientation: %s", new Object[] { localObject3 });
      if ((localObject3 == a.b.hiM) || (localObject3 == a.b.hiN) || (a.b.hiO == localObject3) || (a.b.hiP == localObject3))
      {
        localObject3 = (LinearLayout.LayoutParams)((a.a)localObject2).huw.getLayoutParams();
        ab.i("MicroMsg.WAGameInputPanel", "EditBar setmConfirmButtonPadding tolerate(%d),rightMargin(%d).", new Object[] { Integer.valueOf(j), Integer.valueOf(((LinearLayout.LayoutParams)localObject3).rightMargin) });
        ((LinearLayout.LayoutParams)localObject3).setMargins(((LinearLayout.LayoutParams)localObject3).leftMargin, ((LinearLayout.LayoutParams)localObject3).topMargin, j + ((LinearLayout.LayoutParams)localObject3).rightMargin, ((LinearLayout.LayoutParams)localObject3).bottomMargin);
        ((a.a)localObject2).huw.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      if (localb != null)
        break label589;
      localObject3 = b.jiY;
      label486: locala.getAttachedEditText().setImeOptions(((b)localObject3).jjd);
      locala.getAttachedEditText().setFocusable(true);
      locala.getAttachedEditText().setFocusableInTouchMode(true);
      locala.show();
      switch (com.tencent.mm.plugin.appbrand.game.widget.input.a.2.huv[localObject3.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      AppMethodBeat.o(130205);
      break;
      localWAGamePanelInputEditText.setText("");
      break label151;
      label583: bool3 = false;
      break label159;
      label589: localObject3 = localb;
      break label486;
      ((Button)locala.hur.getConfirmButton()).setText(2131297109);
      AppMethodBeat.o(130205);
      break;
      ((Button)locala.hur.getConfirmButton()).setText(2131297112);
      AppMethodBeat.o(130205);
      break;
      ((Button)locala.hur.getConfirmButton()).setText(2131297111);
      AppMethodBeat.o(130205);
      break;
      ((Button)locala.hur.getConfirmButton()).setText(2131297110);
      AppMethodBeat.o(130205);
      break;
      ((Button)locala.hur.getConfirmButton()).setText(2131297113);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.e.1
 * JD-Core Version:    0.6.2
 */