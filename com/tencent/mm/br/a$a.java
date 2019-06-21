package com.tencent.mm.br;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.view.footer.SelectColorBar;
import com.tencent.mm.y.e;

final class a$a
  implements com.tencent.mm.ae.a
{
  View vwY;
  TextView vwZ;
  ImageView vxa;

  a$a(a parama)
  {
    AppMethodBeat.i(116313);
    this.vwY = this.vwV.vwM.getRubbishView();
    this.vwZ = ((TextView)this.vwY.findViewById(2131827174));
    this.vxa = ((ImageView)this.vwY.findViewById(2131827173));
    AppMethodBeat.o(116313);
  }

  public final void Ta()
  {
    AppMethodBeat.i(116315);
    ab.i("MicroMsg.DrawingPresenter", "[onUnReach]");
    this.vxa.setImageResource(2130840058);
    this.vwZ.setText(this.vwV.vwM.getContext().getString(2131302671));
    AppMethodBeat.o(116315);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(116318);
    EditText localEditText = (EditText)this.vwV.vwM.getTextEditView().findViewById(2131823386);
    localEditText.setText(parame.eHF);
    Switch localSwitch = (Switch)this.vwV.vwM.findViewById(2131823387);
    SelectColorBar localSelectColorBar = (SelectColorBar)this.vwV.vwM.findViewById(2131823388);
    boolean bool;
    if (parame.eHE != 0)
    {
      bool = true;
      localSwitch.setChecked(bool);
      if (!localSwitch.isChecked())
        break label130;
      localSelectColorBar.setSelectColor(parame.eHE);
    }
    while (true)
    {
      localEditText.setTextColor(parame.mColor);
      localEditText.setTag(parame);
      this.vwV.oW(true);
      AppMethodBeat.o(116318);
      return;
      bool = false;
      break;
      label130: localSelectColorBar.setSelectColor(parame.mColor);
    }
  }

  public final void ae(float paramFloat)
  {
    AppMethodBeat.i(116314);
    ab.i("MicroMsg.DrawingPresenter", "[onReach] distance:%s", new Object[] { Float.valueOf(paramFloat) });
    this.vwZ.setText(this.vwV.vwM.getContext().getString(2131302670));
    this.vxa.setImageResource(2130840059);
    AppMethodBeat.o(116314);
  }

  public final void onHide()
  {
    AppMethodBeat.i(116317);
    a.a(this.vwV, false);
    AppMethodBeat.o(116317);
  }

  public final void onShow()
  {
    AppMethodBeat.i(116316);
    a.a(this.vwV, true);
    AppMethodBeat.o(116316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.a.a
 * JD-Core Version:    0.6.2
 */