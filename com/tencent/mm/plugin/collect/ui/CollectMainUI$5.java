package com.tencent.mm.plugin.collect.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CollectMainUI$5
  implements Runnable
{
  CollectMainUI$5(CollectMainUI paramCollectMainUI, LinearLayout paramLinearLayout, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41256);
    ab.d("MicroMsg.CollectMainUI", "height: %d, width: %d", new Object[] { Integer.valueOf(this.kHn.getHeight()), Integer.valueOf(this.kHn.getWidth()) });
    Bitmap localBitmap = Bitmap.createBitmap(this.kHn.getWidth(), this.kHn.getHeight(), Bitmap.Config.ARGB_8888);
    Object localObject = new Canvas(localBitmap);
    this.kHn.draw((Canvas)localObject);
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = n.dly() + "mm_facetoface_collect_qrcode_" + System.currentTimeMillis() + ".png";
      d.a(localBitmap, 100, Bitmap.CompressFormat.PNG, (String)localObject, false);
      if (this.kHo)
        Toast.makeText(this.kHl.mController.ylL, this.kHl.getString(2131304762, new Object[] { localObject }), 1).show();
      n.a((String)localObject, this.kHl.mController.ylL);
      this.kHl.kEu.setVisibility(8);
      AppMethodBeat.o(41256);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.CollectMainUI", "save fixed amount qrcode failed!" + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.5
 * JD-Core Version:    0.6.2
 */