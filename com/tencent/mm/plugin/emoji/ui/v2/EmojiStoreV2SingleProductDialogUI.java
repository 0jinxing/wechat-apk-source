package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.a.c;
import java.io.IOException;

public class EmojiStoreV2SingleProductDialogUI extends MMBaseActivity
{
  public String edV;
  private EmojiInfo exP;
  private ProgressBar gHA;
  private int gOW;
  private c ggF;
  private long kVE;
  private View leP;
  private EmojiStatusView leQ;
  private ImageView leR;
  private Button leS;
  private Button leT;
  private int leU;
  private int leV;
  private DialogInterface.OnClickListener leW;
  private DialogInterface.OnClickListener leX;
  private View.OnClickListener leY;

  public EmojiStoreV2SingleProductDialogUI()
  {
    AppMethodBeat.i(53735);
    this.leW = new EmojiStoreV2SingleProductDialogUI.1(this);
    this.leX = new EmojiStoreV2SingleProductDialogUI.2(this);
    this.leY = new EmojiStoreV2SingleProductDialogUI.3(this);
    AppMethodBeat.o(53735);
  }

  private void blW()
  {
    AppMethodBeat.i(53739);
    if ((this.exP != null) && (this.exP.field_catalog == EmojiGroupInfo.yae))
    {
      this.leT.setEnabled(false);
      this.leT.setText(2131296524);
      this.leT.setTextColor(getResources().getColor(2131690145));
      AppMethodBeat.o(53739);
    }
    while (true)
    {
      return;
      if ((this.exP != null) && (this.exP.duP()))
      {
        this.leT.setEnabled(true);
        this.leT.setText(2131299092);
        this.leT.setTextColor(getResources().getColor(2131689776));
        AppMethodBeat.o(53739);
      }
      else
      {
        this.leT.setEnabled(false);
        this.leT.setText(2131299092);
        this.leT.setTextColor(getResources().getColor(2131690145));
        AppMethodBeat.o(53739);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53738);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      this.ggF.setOnDismissListener(null);
      this.ggF.dismiss();
      setResult(-1);
      finish();
      overridePendingTransition(2131034216, 0);
    }
    AppMethodBeat.o(53738);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53736);
    overridePendingTransition(-1, -1);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setStatusBarColor(0);
      getWindow().setNavigationBarColor(0);
    }
    this.leU = getIntent().getIntExtra("add_source", 5);
    this.leV = getIntent().getIntExtra("entrance_scene", 0);
    this.gOW = getIntent().getIntExtra("scene", 0);
    this.kVE = getIntent().getLongExtra("searchID", 0L);
    this.edV = getIntent().getStringExtra("Select_Conv_User");
    Object localObject = getIntent().getByteArrayExtra("extra_object");
    if (localObject != null);
    try
    {
      paramBundle = new com/tencent/mm/protocal/protobuf/xx;
      paramBundle.<init>();
      paramBundle.parseFrom((byte[])localObject);
      this.exP = j.getEmojiStorageMgr().xYn.aqi(paramBundle.Md5);
      if (this.exP == null)
      {
        localObject = new com/tencent/mm/storage/emotion/EmojiInfo;
        ((EmojiInfo)localObject).<init>();
        this.exP = ((EmojiInfo)localObject);
        this.exP.field_catalog = 84;
        this.exP.field_reserved4 |= EmojiInfo.yaB;
        b.a(paramBundle, this.exP);
      }
      if (this.exP == null)
      {
        setResult(0);
        finish();
      }
      this.leP = v.hu(this).inflate(2130969378, null);
      this.gHA = ((ProgressBar)this.leP.findViewById(2131823589));
      this.leQ = ((EmojiStatusView)this.leP.findViewById(2131823588));
      this.leR = ((ImageView)this.leP.findViewById(2131823587));
      this.leR.setOnClickListener(this.leY);
      this.ggF = h.a(this, this.leP, "");
      this.ggF.a(getString(2131297041), false, this.leW);
      this.ggF.b(getString(2131296524), false, this.leX);
      this.ggF.setOnDismissListener(new EmojiStoreV2SingleProductDialogUI.4(this));
      this.leS = this.ggF.getButton(-1);
      this.leT = this.ggF.getButton(-2);
      this.leQ.setVisibility(8);
      this.gHA.setVisibility(0);
      this.leT.setText(2131299092);
      this.leS.setText(2131297041);
      this.leT.setEnabled(false);
      this.leT.setTextColor(getResources().getColor(2131690145));
      this.leS.setEnabled(false);
      this.leS.setTextColor(getResources().getColor(2131690145));
      this.leQ.setStatusListener(new EmojiStoreV2SingleProductDialogUI.5(this));
      this.leQ.setEmojiInfo(this.exP);
      AppMethodBeat.o(53736);
      return;
    }
    catch (IOException paramBundle)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", paramBundle, "", new Object[0]);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53740);
    super.onDestroy();
    this.ggF.setOnDismissListener(null);
    if (this.ggF.isShowing())
      this.ggF.dismiss();
    AppMethodBeat.o(53740);
  }

  public void onResume()
  {
    AppMethodBeat.i(53737);
    super.onResume();
    if (this.exP != null)
    {
      EmojiInfo localEmojiInfo = j.getEmojiStorageMgr().xYn.aqi(this.exP.field_md5);
      if (localEmojiInfo != null)
        this.exP = localEmojiInfo;
    }
    blW();
    this.ggF.show();
    AppMethodBeat.o(53737);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI
 * JD-Core Version:    0.6.2
 */