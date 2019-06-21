package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;

public class PreviewLastHdHeadImg extends MMActivity
  implements View.OnClickListener
{
  private ImageView cAw;
  private String imgPath;
  private Bitmap qlr;
  private TextView qls;
  private String username;

  private static boolean e(Bitmap paramBitmap, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(127011);
    if ((paramString != null) && (!paramString.equals("")));
    while (true)
    {
      try
      {
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, true);
        AppMethodBeat.o(127011);
        return bool;
      }
      catch (Exception paramBitmap)
      {
        ab.printErrStackTrace("MicroMsg.PreviewLastHdHeadImg", paramBitmap, "", new Object[0]);
        ab.e("MicroMsg.PreviewLastHdHeadImg", "saveBitmapToImage failed:" + paramBitmap.toString());
      }
      AppMethodBeat.o(127011);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130969800;
  }

  public final void initView()
  {
    AppMethodBeat.i(127010);
    setMMTitle(2131303120);
    xE(getResources().getColor(2131690597));
    Nb(getResources().getColor(2131689481));
    this.username = r.Yz();
    this.imgPath = getIntent().getStringExtra("last_avatar_path");
    this.cAw = ((ImageView)findViewById(2131824668));
    this.qlr = d.aml(this.imgPath);
    this.qls = ((TextView)findViewById(2131824669));
    this.cAw.setImageBitmap(this.qlr);
    this.qls.setOnClickListener(this);
    addIconOptionMenu(0, 2130839555, new PreviewLastHdHeadImg.1(this));
    setBackBtn(new PreviewLastHdHeadImg.2(this));
    AppMethodBeat.o(127010);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(127012);
    String str = getIntent().getStringExtra("CropImage_OutputPath");
    if ((str != null) && (e(this.qlr, str)))
    {
      paramView = new Intent();
      paramView.putExtra("CropImage_OutputPath", str);
      setResult(-1, paramView);
      finish();
      AppMethodBeat.o(127012);
    }
    while (true)
    {
      return;
      setResult(0);
      finish();
      AppMethodBeat.o(127012);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127009);
    this.ylm = true;
    super.onCreate(paramBundle);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    initView();
    AppMethodBeat.o(127009);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg
 * JD-Core Version:    0.6.2
 */