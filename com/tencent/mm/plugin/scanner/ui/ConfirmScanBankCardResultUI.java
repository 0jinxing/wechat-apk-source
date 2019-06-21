package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.HashMap;
import java.util.Map;

@a(3)
public class ConfirmScanBankCardResultUI extends MMActivity
{
  protected static final Map<String, Bitmap> qcf;
  protected Bitmap mBmp = null;
  private String qce = null;
  private ImageView qcg;
  private EditText qch;

  static
  {
    AppMethodBeat.i(81017);
    qcf = new HashMap();
    AppMethodBeat.o(81017);
  }

  public static void c(Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(81012);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(81012);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(ah.getContext(), ConfirmScanBankCardResultUI.class);
      localIntent.addFlags(268435456);
      localIntent.putExtra("_card_num_", paramString);
      paramString = "_image_cache_key_".concat(String.valueOf(paramString));
      qcf.put(paramString, paramBitmap);
      localIntent.putExtra("_image_cache_key_", paramString);
      ah.getContext().startActivity(localIntent);
      AppMethodBeat.o(81012);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(81015);
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 7);
    localIntent.putExtra("scan_bankcard_with_confirm_ui", true);
    localIntent.addFlags(268435456);
    localIntent.setClass(this, BaseScanUI.class);
    startActivity(localIntent);
    super.finish();
    AppMethodBeat.o(81015);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969192;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(81013);
    super.onCreate(paramBundle);
    setMMTitle(2131302789);
    int i;
    if (getIntent() == null)
    {
      ab.e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
      i = 0;
      if (i != 0)
        break label134;
      finish();
      AppMethodBeat.o(81013);
    }
    while (true)
    {
      return;
      this.qce = getIntent().getStringExtra("_image_cache_key_");
      if (bo.isNullOrNil(this.qce))
      {
        ab.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
        i = 0;
        break;
      }
      this.mBmp = ((Bitmap)qcf.get(this.qce));
      if ((this.mBmp == null) || (this.mBmp.isRecycled()))
      {
        ab.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
        i = 0;
        break;
      }
      i = 1;
      break;
      label134: paramBundle = getIntent().getStringExtra("_card_num_");
      if (bo.isNullOrNil(paramBundle))
      {
        ab.e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
        finish();
        AppMethodBeat.o(81013);
      }
      else
      {
        this.qcg = ((ImageView)findViewById(2131822949));
        this.qch = ((EditText)findViewById(2131822950));
        this.qcg.setImageBitmap(this.mBmp);
        this.qch.setText(paramBundle);
        findViewById(2131822951).setOnClickListener(new ConfirmScanBankCardResultUI.1(this));
        setBackBtn(new ConfirmScanBankCardResultUI.2(this));
        AppMethodBeat.o(81013);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(81014);
    super.onDestroy();
    if (this.qcg != null)
      this.qcg.setImageBitmap(null);
    if (!bo.isNullOrNil(this.qce))
      qcf.remove(this.qce);
    if (this.mBmp != null)
    {
      ab.i("MicroMsg.ConfirmScanBankCardResultUI", "bitmap recycle %s", new Object[] { this.mBmp.toString() });
      this.mBmp.recycle();
    }
    AppMethodBeat.o(81014);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI
 * JD-Core Version:    0.6.2
 */