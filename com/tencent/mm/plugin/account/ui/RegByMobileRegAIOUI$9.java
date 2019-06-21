package com.tencent.mm.plugin.account.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.MMFormInputView;

final class RegByMobileRegAIOUI$9
  implements al.a
{
  String nickname;

  RegByMobileRegAIOUI$9(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(125349);
    this.nickname = i.cj(this.gGd);
    RegByMobileRegAIOUI.a(this.gGd, i.ck(this.gGd));
    if ((RegByMobileRegAIOUI.n(this.gGd) != null) && (!RegByMobileRegAIOUI.n(this.gGd).isRecycled()));
    try
    {
      Bitmap localBitmap = RegByMobileRegAIOUI.n(this.gGd);
      Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.PNG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      d.a(localBitmap, 100, localCompressFormat, e.euY + "temp.avatar", false);
      AppMethodBeat.o(125349);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RegByMobileRegAIOUI", "save avatar fail." + localException.getMessage());
        ab.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", localException, "", new Object[0]);
      }
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(125348);
    if ((!bo.isNullOrNil(this.nickname)) && (bo.isNullOrNil(RegByMobileRegAIOUI.k(this.gGd).getText().trim())))
      RegByMobileRegAIOUI.k(this.gGd).setText(this.nickname);
    boolean bool;
    if (!f.Mn())
    {
      ab.e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
      bool = false;
      AppMethodBeat.o(125348);
    }
    while (true)
    {
      return bool;
      if ((RegByMobileRegAIOUI.n(this.gGd) != null) && (!RegByMobileRegAIOUI.n(this.gGd).isRecycled()) && (!RegByMobileRegAIOUI.o(this.gGd)))
      {
        RegByMobileRegAIOUI.p(this.gGd).setImageBitmap(RegByMobileRegAIOUI.n(this.gGd));
        RegByMobileRegAIOUI.q(this.gGd).setVisibility(8);
        RegByMobileRegAIOUI.r(this.gGd);
      }
      bool = true;
      AppMethodBeat.o(125348);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(125350);
    String str = super.toString() + "|initView2";
    AppMethodBeat.o(125350);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.9
 * JD-Core Version:    0.6.2
 */