package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeItemListUI$a$a
{
  TextView gtG;
  ImageView gvq;
  TextView gvr;
  TextView oQA;
  ImageView oQB;
  TextView oQz;
  View quG;
  ImageView quH;
  TextView quI;
  LinearLayout quJ;
  TextView quK;

  ShakeItemListUI$a$a(ShakeItemListUI.a parama)
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(24731);
    if (this.gvq != null)
    {
      this.gvq.setImageDrawable(null);
      this.gvq.setVisibility(8);
    }
    if (this.gtG != null)
    {
      this.gtG.setText("");
      this.gtG.setVisibility(8);
    }
    if (this.gvr != null)
      this.gvr.setVisibility(8);
    if (this.quH != null)
      this.quH.setVisibility(8);
    if (this.oQz != null)
    {
      this.oQz.setText("");
      this.oQz.setVisibility(8);
    }
    if (this.oQA != null)
    {
      this.oQA.setVisibility(8);
      this.quG.setVisibility(8);
    }
    if (this.oQB != null)
      this.oQB.setVisibility(8);
    if (this.quI != null)
    {
      this.quI.setText("");
      this.quI.setVisibility(8);
    }
    AppMethodBeat.o(24731);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.a.a
 * JD-Core Version:    0.6.2
 */