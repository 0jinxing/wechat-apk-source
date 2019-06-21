package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class BioHelperUI extends MMActivity
{
  private String elr;
  private String igi;
  private int lqz;
  private int mType;
  private String nER;
  private String vgT;
  private BioHelperUI.b vgU;

  public final int getLayoutId()
  {
    return 2130968850;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(125682);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null);
    while (true)
    {
      ab.i("MicroMsg.BioHelperUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      this.vgU.f(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(125682);
      return;
      bool = false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(125681);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("k_type", 1);
    ab.i("MicroMsg.BioHelperUI", "hy: starting to bio helper ui, type: %d", new Object[] { Integer.valueOf(this.mType) });
    this.igi = bo.bc(getIntent().getStringExtra("Kusername"), null);
    this.elr = bo.bc(getIntent().getStringExtra("Kvertify_key"), null);
    this.vgT = bo.bc(getIntent().getStringExtra("KVoiceHelpUrl"), null);
    this.nER = bo.bc(getIntent().getStringExtra("KVoiceHelpWording"), null);
    this.lqz = getIntent().getIntExtra("KVoiceHelpCode", 0);
    if (this.mType == 0)
      paramBundle = new BioHelperUI.c(this, (byte)0);
    while (true)
    {
      this.vgU = paramBundle;
      if ((this.vgU != null) && (!bo.isNullOrNil(this.igi)) && (!bo.isNullOrNil(this.elr)))
        break;
      ab.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
      finish();
      AppMethodBeat.o(125681);
      return;
      if (this.mType == 1)
      {
        paramBundle = new BioHelperUI.a(this, (byte)0);
      }
      else
      {
        ab.e("MicroMsg.BioHelperUI", "hy: invalid type!!!");
        paramBundle = localObject;
      }
    }
    paramBundle = (TextView)findViewById(2131821789);
    if (!bo.isNullOrNil(this.nER))
      paramBundle.setText(this.nER);
    while (true)
    {
      setMMTitle(this.vgU.diT());
      ((ImageView)findViewById(2131821788)).setImageResource(this.vgU.diU());
      setBackBtn(new BioHelperUI.1(this));
      this.vgU.aE(getIntent());
      paramBundle = (Button)findViewById(2131821790);
      paramBundle.setText(this.vgU.diV());
      paramBundle.setOnClickListener(new BioHelperUI.2(this));
      findViewById(2131821791).setOnClickListener(new BioHelperUI.3(this));
      AppMethodBeat.o(125681);
      break;
      paramBundle.setText(this.vgU.diW());
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.BioHelperUI
 * JD-Core Version:    0.6.2
 */