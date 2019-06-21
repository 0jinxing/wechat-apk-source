package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class WalletMultiRcptSelectUI extends MMPreference
{
  private int cGC = 0;
  private f ehK;
  private RcptItem gKW = null;
  private RcptItem gKX = null;
  private List<RcptItem> gKY;

  private void ash()
  {
    AppMethodBeat.i(16965);
    Object localObject = a.arS().gIR;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      ab.e("MicroMsg.MultiRptSelectUI", "list == null || list.isEmpty(), need loadata!");
      a.arS().arT();
    }
    switch (this.cGC)
    {
    default:
      a.arQ();
      localObject = a.arS().gIR;
      label79: this.gKY = ((List)localObject);
      if ((this.gKY == null) || (this.gKY.size() <= 0))
      {
        ab.e("MicroMsg.MultiRptSelectUI", "initZoneItems error ,check zone lists!");
        AppMethodBeat.o(16965);
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      a.arQ();
      localObject = a.arS().gIR;
      break label79;
      if ((this.gKW != null) && (!bo.isNullOrNil(this.gKW.code)))
      {
        a.arQ();
        localObject = a.arS().wC(this.gKW.code);
        break label79;
      }
      if ((this.gKX == null) || (bo.isNullOrNil(this.gKX.code)))
        break;
      a.arQ();
      localObject = a.arS().wD(this.gKX.code);
      break label79;
      this.ehK.removeAll();
      int i = 0;
      if (i < this.gKY.size())
      {
        RcptPreference localRcptPreference;
        if ((this.gKY.get(i) != null) && (!bo.isNullOrNil(((RcptItem)this.gKY.get(i)).name)))
        {
          localRcptPreference = new RcptPreference(this);
          localObject = (RcptItem)this.gKY.get(i);
          if ((localObject != null) && (!bo.isNullOrNil(((RcptItem)localObject).name)))
            break label332;
          ab.e("MicroMsg.RcptPreference", "setZoneItem item = null");
        }
        while (true)
        {
          this.ehK.b(localRcptPreference);
          i++;
          break;
          label332: localRcptPreference.setKey(((RcptItem)localObject).code + localRcptPreference.hashCode());
          localRcptPreference.gKN = ((RcptItem)localObject);
        }
      }
      localObject = new PreferenceSmallCategory(this);
      this.ehK.b((Preference)localObject);
      AppMethodBeat.o(16965);
    }
  }

  private void asi()
  {
    AppMethodBeat.i(16966);
    switch (this.cGC)
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_stage", this.cGC);
      localIntent.putExtra("key_province", this.gKW);
      localIntent.putExtra("key_city", this.gKX);
      setResult(0, localIntent);
      finish();
      AppMethodBeat.o(16966);
      return;
      this.gKX = null;
      this.cGC = 1;
      continue;
      this.gKW = null;
      this.cGC = 0;
    }
  }

  private void x(Intent paramIntent)
  {
    AppMethodBeat.i(16971);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.MultiRptSelectUI", "initData intent is null");
      AppMethodBeat.o(16971);
    }
    while (true)
    {
      return;
      this.cGC = paramIntent.getIntExtra("key_stage", 0);
      this.gKW = ((RcptItem)paramIntent.getParcelableExtra("key_province"));
      this.gKX = ((RcptItem)paramIntent.getParcelableExtra("key_city"));
      String str = paramIntent.getStringExtra("extra_province");
      if (str != null)
      {
        a.arQ();
        this.gKW = a.arS().wE(str);
        if (this.gKW != null)
          this.cGC = 1;
      }
      paramIntent = paramIntent.getStringExtra("extra_city");
      if ((paramIntent != null) && (1 == this.cGC))
      {
        a.arQ();
        this.gKX = a.arS().bl(this.gKW.code, paramIntent);
        if (this.gKX != null)
          this.cGC = 2;
      }
      AppMethodBeat.o(16971);
    }
  }

  public final int JC()
  {
    return 2131165265;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(16972);
    if ((paramPreference instanceof RcptPreference))
    {
      paramf = ((RcptPreference)paramPreference).gKN;
      if ((paramf == null) || (bo.isNullOrNil(paramf.name)))
      {
        ab.e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
        AppMethodBeat.o(16972);
        return false;
      }
      if (!paramf.gIP)
        this.cGC = 2;
      switch (this.cGC)
      {
      default:
        label92: paramf = getIntent();
        if (paramf == null)
          break;
      case 0:
      case 1:
      case 2:
      }
    }
    for (int i = paramf.getIntExtra("ui_title", -1); ; i = -1)
    {
      paramf = new Intent(this, WalletMultiRcptSelectUI.class);
      paramf.putExtra("key_stage", this.cGC);
      paramf.putExtra("key_province", this.gKW);
      paramf.putExtra("key_city", this.gKX);
      if (-1 != i)
        paramf.putExtra("ui_title", i);
      startActivityForResult(paramf, 1);
      while (true)
      {
        AppMethodBeat.o(16972);
        break;
        this.gKW = paramf;
        this.cGC = 1;
        break label92;
        this.gKX = paramf;
        this.cGC = 2;
        break label92;
        StringBuilder localStringBuilder = new StringBuilder();
        if (this.gKW != null)
          localStringBuilder.append(this.gKW.name).append(" ");
        if (this.gKX != null)
          localStringBuilder.append(this.gKX.name).append(" ");
        localStringBuilder.append(paramf.name);
        ab.d("MicroMsg.MultiRptSelectUI", "area_result: " + localStringBuilder.toString() + ",item.name: " + paramf.name);
        paramPreference = new Intent();
        paramPreference.putExtra("karea_result", localStringBuilder.toString());
        paramPreference.putExtra("kpost_code", paramf.gIO);
        paramPreference.putExtra("kwcode", paramf.code);
        setResult(-1, paramPreference);
        finish();
      }
    }
  }

  public final void initView()
  {
    int i = 2131296478;
    AppMethodBeat.i(16970);
    Intent localIntent = getIntent();
    if (localIntent != null)
      i = localIntent.getIntExtra("ui_title", 2131296478);
    setMMTitle(i);
    setBackBtn(new WalletMultiRcptSelectUI.1(this));
    x(localIntent);
    ash();
    AppMethodBeat.o(16970);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(16974);
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(16974);
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        setResult(-1, paramIntent);
        finish();
        AppMethodBeat.o(16974);
      }
      x(paramIntent);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(16973);
    asi();
    super.onBackPressed();
    AppMethodBeat.o(16973);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16967);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(16967);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16969);
    super.onDestroy();
    AppMethodBeat.o(16969);
  }

  public void onResume()
  {
    AppMethodBeat.i(16968);
    super.onResume();
    AppMethodBeat.o(16968);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI
 * JD-Core Version:    0.6.2
 */