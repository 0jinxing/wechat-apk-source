package com.tencent.mm.plugin.account.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class RegSetInfoUI$23
  implements al.a
{
  String gHT;
  Bitmap mBitmap;

  RegSetInfoUI$23(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(125529);
    try
    {
      this.gHT = i.cj(this.gHM);
      this.mBitmap = i.ck(this.gHM);
      if ((this.mBitmap == null) || (this.mBitmap.isRecycled()));
    }
    catch (Exception localException1)
    {
      try
      {
        Bitmap localBitmap = this.mBitmap;
        Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.PNG;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        d.a(localBitmap, 100, localCompressFormat, e.euY + "temp.avatar", false);
        AppMethodBeat.o(125529);
        return true;
        localException1 = localException1;
        ab.e("MiroMsg.RegSetInfoUI", "getName or getBitmap err : " + localException1.getMessage());
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MiroMsg.RegSetInfoUI", "save avatar fail." + localException2.getMessage());
          ab.printErrStackTrace("MiroMsg.RegSetInfoUI", localException2, "", new Object[0]);
        }
      }
    }
  }

  public final boolean acg()
  {
    boolean bool = false;
    AppMethodBeat.i(125528);
    if ((!bo.isNullOrNil(this.gHT)) && (bo.isNullOrNil(RegSetInfoUI.b(this.gHM).getText().trim())))
      RegSetInfoUI.b(this.gHM).setText(this.gHT);
    if (!f.Mn())
    {
      ab.e("MiroMsg.RegSetInfoUI", "SDcard is not available");
      AppMethodBeat.o(125528);
    }
    while (true)
    {
      return bool;
      if ((this.mBitmap != null) && (!this.mBitmap.isRecycled()) && (!RegSetInfoUI.j(this.gHM)))
      {
        RegSetInfoUI.i(this.gHM).setImageBitmap(this.mBitmap);
        RegSetInfoUI.k(this.gHM);
        RegSetInfoUI.l(this.gHM).setVisibility(0);
      }
      bool = true;
      AppMethodBeat.o(125528);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(125530);
    String str = super.toString() + "|initView";
    AppMethodBeat.o(125530);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.23
 * JD-Core Version:    0.6.2
 */