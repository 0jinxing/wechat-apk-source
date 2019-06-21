package com.tencent.mm.plugin.collect.reward.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class QrRewardMainUI$8
  implements Runnable
{
  QrRewardMainUI$8(QrRewardMainUI paramQrRewardMainUI, ViewGroup paramViewGroup, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41091);
    ab.d("MicroMsg.QrRewardMainUI", "height: %d, width: %d", new Object[] { Integer.valueOf(this.kEF.getHeight()), Integer.valueOf(this.kEF.getWidth()) });
    Bitmap localBitmap = Bitmap.createBitmap(QrRewardMainUI.s(this.kEC).getWidth(), QrRewardMainUI.s(this.kEC).getHeight(), Bitmap.Config.ARGB_8888);
    Object localObject = new Canvas(localBitmap);
    QrRewardMainUI.s(this.kEC).draw((Canvas)localObject);
    this.kEG.setImageBitmap(localBitmap);
    localBitmap = Bitmap.createBitmap(this.kEF.getWidth(), this.kEF.getHeight(), Bitmap.Config.ARGB_8888);
    localObject = new Canvas(localBitmap);
    this.kEF.draw((Canvas)localObject);
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = n.dly() + "mm_reward_qrcode_" + System.currentTimeMillis() + ".png";
      d.a(localBitmap, 100, Bitmap.CompressFormat.PNG, (String)localObject, false);
      Toast.makeText(this.kEC.mController.ylL, this.kEC.getString(2131298807, new Object[] { localObject }), 1).show();
      n.a((String)localObject, this.kEC.mController.ylL);
      QrRewardMainUI.t(this.kEC).setVisibility(8);
      ab.i("MicroMsg.QrRewardMainUI", "bitmap recycle %s", new Object[] { localBitmap.toString() });
      localBitmap.recycle();
      AppMethodBeat.o(41091);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.QrRewardMainUI", "save fixed amount qrcode failed!" + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.8
 * JD-Core Version:    0.6.2
 */