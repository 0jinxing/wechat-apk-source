package com.tencent.mm.plugin.ipcall.ui;

import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class b$3
  implements DialPad.a
{
  b$3(b paramb)
  {
  }

  public final void OX(String paramString)
  {
    AppMethodBeat.i(21972);
    this.nAl.nAb = this.nAl.nzT.getText().toString();
    if (this.nAl.nAf)
    {
      this.nAl.nAa += paramString;
      this.nAl.nzS.setText(this.nAl.nAa);
      if ((a.Pt(this.nAl.nAa.replace("+", ""))) || (this.nAl.nAa.replace("+", "").length() >= 4))
      {
        h.pYm.e(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
        this.nAl.nAf = false;
        this.nAl.nzZ = a.Pq(this.nAl.nAa.replace("+", ""));
        this.nAl.nAb = b.eL(this.nAl.nAa.replace("+", ""), this.nAl.nAb);
        this.nAl.cq(this.nAl.nAb, -1);
        AppMethodBeat.o(21972);
      }
    }
    else
    {
      String str = this.nAl.nzS.getText().toString().replace("+", "");
      if (!this.nAl.nAi)
        break label728;
      StringBuffer localStringBuffer = new StringBuffer(this.nAl.nAb);
      localStringBuffer.insert(this.nAl.nzT.getSelectionStart(), paramString);
      this.nAl.nAb = localStringBuffer.toString();
      label341: if (this.nAl.nAb.equals("00"))
      {
        this.nAl.nzS.setText("+");
        this.nAl.nAf = true;
        this.nAl.nAa = "+";
        this.nAl.nAb = "";
      }
      if (a.Pt(this.nAl.nAa.replace("+", "") + this.nAl.nAb))
      {
        this.nAl.nzS.setText("+" + this.nAl.nAa.replace("+", "") + this.nAl.nAb);
        this.nAl.nzZ = a.Pq(this.nAl.nAa.replace("+", ""));
        this.nAl.nAf = false;
        this.nAl.nAa = (this.nAl.nAa.replace("+", "") + this.nAl.nAb);
        this.nAl.nAb = "";
      }
      paramString = this.nAl.nAb;
      this.nAl.nAb = b.eL(str, this.nAl.nAb);
      if (!this.nAl.nAi)
        break label870;
      if (paramString.length() >= this.nAl.nAb.length())
        break label762;
      this.nAl.cq(this.nAl.nAb, this.nAl.nzT.getSelectionEnd() + 2);
    }
    label728: label870: 
    while (true)
    {
      this.nAl.nAe = System.currentTimeMillis();
      if ((this.nAl.nAb.length() > a.nGS) && (!bo.isNullOrNil(this.nAl.nAa + this.nAl.nAb)))
        this.nAl.bId();
      AppMethodBeat.o(21972);
      break;
      this.nAl.nAb += paramString;
      break label341;
      label762: if (paramString.length() == this.nAl.nAb.length())
      {
        this.nAl.cq(this.nAl.nAb, this.nAl.nzT.getSelectionEnd() + 1);
      }
      else if (paramString.length() > this.nAl.nAb.length())
      {
        this.nAl.cq(this.nAl.nAb, this.nAl.nzT.getSelectionEnd() + 1 - (paramString.length() - this.nAl.nAb.length()));
        continue;
        this.nAl.cq(this.nAl.nAb, -1);
      }
    }
  }

  public final void OY(String paramString)
  {
    AppMethodBeat.i(21973);
    if (paramString.equals("0"))
    {
      this.nAl.nzS.setText("+");
      this.nAl.nAf = true;
      this.nAl.nAa = "+";
    }
    AppMethodBeat.o(21973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.3
 * JD-Core Version:    0.6.2
 */