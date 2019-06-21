package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public class ShareImageSelectorUI extends MMActivity
  implements AdapterView.OnItemClickListener
{
  private static int zKF = 1;
  private ImageView ikh;
  private View laJ;
  private ak mHandler;
  private ListView mListView;
  private String zIs;
  private a zKG;
  private Dialog zKH;
  private View.OnClickListener zKI;
  private int zou;

  public ShareImageSelectorUI()
  {
    AppMethodBeat.i(35257);
    this.zou = 2;
    this.zKI = new ShareImageSelectorUI.1(this);
    this.mHandler = new ShareImageSelectorUI.2(this);
    AppMethodBeat.o(35257);
  }

  private void bKc()
  {
    AppMethodBeat.i(35263);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131298813), getString(2131298815), true, new ShareImageSelectorUI.4(this), new ShareImageSelectorUI.5(this));
    AppMethodBeat.o(35263);
  }

  private void dKr()
  {
    AppMethodBeat.i(35264);
    if ((this.zKH != null) && (this.zKH.isShowing()))
      AppMethodBeat.o(35264);
    while (true)
    {
      return;
      String str1 = getString(2131298817);
      String str2 = getString(2131298818);
      String str3 = getString(2131298816);
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      String str4 = getString(2131301428);
      ShareImageSelectorUI.6 local6 = new ShareImageSelectorUI.6(this);
      ShareImageSelectorUI.7 local7 = new ShareImageSelectorUI.7(this);
      this.zKH = com.tencent.mm.ui.base.h.a(localAppCompatActivity, str4, new String[] { str1, str2, str3 }, null, local6, local7);
      AppMethodBeat.o(35264);
    }
  }

  private void dKs()
  {
    AppMethodBeat.i(35265);
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_attr", s.znL);
    localIntent.putExtra("titile", getString(2131296482));
    localIntent.putExtra("list_type", 11);
    localIntent.putExtra("shareImage", true);
    localIntent.putExtra("shareImagePath", this.zIs);
    startActivityForResult(localIntent, 1001);
    AppMethodBeat.o(35265);
  }

  private void dKt()
  {
    AppMethodBeat.i(35266);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", this.zIs);
    localIntent.putExtra("need_result", true);
    com.tencent.mm.bp.d.b(this.mController.ylL, "sns", ".ui.SnsUploadUI", localIntent, 1002);
    AppMethodBeat.o(35266);
  }

  private void dKu()
  {
    AppMethodBeat.i(35267);
    cl localcl = new cl();
    e.a(localcl, 6, this.zIs);
    localcl.cvA.activity = this;
    localcl.cvA.cvH = 52;
    a.xxA.m(localcl);
    com.tencent.mm.plugin.report.service.h.pYm.e(11048, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0) });
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessageDelayed(0, 800L);
    AppMethodBeat.o(35267);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970664;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(35261);
    ab.d("MicroMsg.ShareImageSelectorUI", "requestCode:%d , resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
      ab.w("MicroMsg.ShareImageSelectorUI", "unknow result");
      AppMethodBeat.o(35261);
    case 1001:
    case 1002:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        ArrayList localArrayList = null;
        if (paramIntent != null)
          localArrayList = paramIntent.getStringArrayListExtra("Select_Contact");
        if ((localArrayList != null) && (localArrayList.size() == 1))
        {
          paramIntent = new Intent(this, ChattingUI.class);
          paramIntent.putExtra("Chat_User", (String)localArrayList.get(0));
          startActivity(paramIntent);
        }
        finish();
        AppMethodBeat.o(35261);
      }
      else
      {
        ab.w("MicroMsg.ShareImageSelectorUI", "user cancle");
        AppMethodBeat.o(35261);
        continue;
        if (paramInt2 == -1)
        {
          Toast.makeText(this.mController.ylL, 2131298422, 0).show();
          finish();
          AppMethodBeat.o(35261);
        }
        else
        {
          ab.w("MicroMsg.ShareImageSelectorUI", "user cancle");
          AppMethodBeat.o(35261);
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(35262);
    bKc();
    AppMethodBeat.o(35262);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35258);
    super.onCreate(paramBundle);
    aw.ZK();
    paramBundle = c.Ry().get(229635, null);
    if ((paramBundle instanceof Integer))
    {
      i = ((Integer)paramBundle).intValue();
      if ((i == 0) || (i == 1))
        zKF = i;
    }
    setMMTitle(2131301428);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(35249);
        ShareImageSelectorUI.b(ShareImageSelectorUI.this);
        AppMethodBeat.o(35249);
        return false;
      }
    });
    this.zou = getIntent().getIntExtra("Select_Conv_Type", 2);
    this.zIs = getIntent().getStringExtra("intent_extra_image_path");
    this.laJ = findViewById(2131824524);
    this.ikh = ((ImageView)findViewById(2131820629));
    this.ikh.setOnClickListener(this.zKI);
    this.mListView = ((ListView)findViewById(2131820986));
    this.zKG = new a();
    this.mListView.setAdapter(this.zKG);
    this.mListView.setOnItemClickListener(this);
    ab.d("MicroMsg.ShareImageSelectorUI", "mSelectType:%s ImagePath:%s", new Object[] { this.zou, this.zIs });
    if (zKF == 1)
    {
      setTitleVisibility(8);
      this.mListView.setVisibility(8);
      this.ikh.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.ikh.setPadding(0, 0, 0, 0);
      this.ikh.setOnClickListener(null);
      this.laJ.setBackgroundColor(getResources().getColor(2131689915));
      dKr();
    }
    long l = System.currentTimeMillis();
    paramBundle = x.vv(this.zIs);
    int i = BackwardSupportUtil.ExifHelper.bJ(this.zIs);
    ab.d("MicroMsg.ShareImageSelectorUI", "cpan [onCreate]degree:%d", new Object[] { Integer.valueOf(i) });
    paramBundle = com.tencent.mm.sdk.platformtools.d.b(paramBundle, i);
    if ((paramBundle != null) && (!paramBundle.isRecycled()))
      this.ikh.setImageBitmap(paramBundle);
    ab.d("MicroMsg.ShareImageSelectorUI", "cpan[onCreate] Read Bitmap Time:%s", new Object[] { System.currentTimeMillis() - l + "'" });
    AppMethodBeat.o(35258);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(35260);
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.ShareImageSelectorUI", "unknow postion.");
      AppMethodBeat.o(35260);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      dKs();
      AppMethodBeat.o(35260);
      continue;
      dKt();
      AppMethodBeat.o(35260);
      continue;
      dKu();
      AppMethodBeat.o(35260);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(35259);
    super.onResume();
    if ((zKF == 1) && ((this.zKH == null) || (!this.zKH.isShowing())))
      dKr();
    AppMethodBeat.o(35259);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    public ShareImageSelectorUI.a.a[] zKK;

    a()
    {
      AppMethodBeat.i(35254);
      this.zKK = new ShareImageSelectorUI.a.a[] { new ShareImageSelectorUI.a.a(this, 2131298817, 2131231920), new ShareImageSelectorUI.a.a(this, 2131298818, 2131231296), new ShareImageSelectorUI.a.a(this, 2131298816, 2131231632) };
      AppMethodBeat.o(35254);
    }

    public final int getCount()
    {
      return 3;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(35255);
      if ((paramView == null) || (paramView.getTag() == null))
        paramView = LayoutInflater.from(ShareImageSelectorUI.this.mController.ylL).inflate(2130970665, null);
      for (paramViewGroup = new ShareImageSelectorUI.b(ShareImageSelectorUI.this, paramView); ; paramViewGroup = (ShareImageSelectorUI.b)paramView.getTag())
      {
        ShareImageSelectorUI.a.a locala = this.zKK[paramInt];
        if (locala != null)
        {
          paramViewGroup.zKO.setText(locala.zKL);
          paramViewGroup.mlG.setImageResource(locala.zKM);
        }
        AppMethodBeat.o(35255);
        return paramView;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ShareImageSelectorUI
 * JD-Core Version:    0.6.2
 */