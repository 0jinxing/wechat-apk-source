package com.tencent.mm.plugin.subapp.ui.autoadd;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class AutoAddFriendUI extends MMActivity
{
  private int status;
  private MMSwitchBtn str;
  private TextView sts;
  private MMSwitchBtn stt;
  private SparseIntArray stu;

  public AutoAddFriendUI()
  {
    AppMethodBeat.i(25332);
    this.str = null;
    this.sts = null;
    this.stt = null;
    this.stu = new SparseIntArray();
    AppMethodBeat.o(25332);
  }

  private boolean Be(int paramInt)
  {
    if ((this.status & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean cDG()
  {
    AppMethodBeat.i(25334);
    aw.ZK();
    c.Ry().set(7, Integer.valueOf(this.status));
    for (int i = 0; i < this.stu.size(); i++)
    {
      int j = this.stu.keyAt(i);
      int k = this.stu.valueAt(i);
      act localact = new act();
      localact.wkw = j;
      localact.pvD = k;
      aw.ZK();
      c.XL().c(new j.a(23, localact));
      ab.d("MicroMsg.AutoAddFriendUI", "switch  " + j + " " + k);
    }
    this.stu.clear();
    AppMethodBeat.o(25334);
    return true;
  }

  private static int cDH()
  {
    AppMethodBeat.i(25336);
    String str1 = g.Nu().getValue("AutoAddFriendShow");
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = "0";
    try
    {
      i = bo.getInt(str2, 0);
      ab.d("MicroMsg.AutoAddFriendUI", "getAutoAddDynamicConfig, autoAdd = %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(25336);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  public final int getLayoutId()
  {
    return 2130968788;
  }

  public final void initView()
  {
    AppMethodBeat.i(25335);
    this.str = ((MMSwitchBtn)findViewById(2131821551));
    this.sts = ((TextView)findViewById(2131821552));
    this.stt = ((MMSwitchBtn)findViewById(2131821553));
    boolean bool = Be(32);
    this.str.setCheck(bool);
    if (cDH() == 1)
    {
      this.stt.setCheck(Be(2097152));
      this.stt.setSwitchListener(new AutoAddFriendUI.1(this));
    }
    while (true)
    {
      this.str.setSwitchListener(new AutoAddFriendUI.2(this));
      setBackBtn(new AutoAddFriendUI.3(this));
      AppMethodBeat.o(25335);
      return;
      this.sts.setVisibility(8);
      this.stt.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25333);
    super.onCreate(paramBundle);
    setMMTitle(2131297184);
    this.status = r.YD();
    initView();
    AppMethodBeat.o(25333);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25339);
    super.onDestroy();
    AppMethodBeat.o(25339);
  }

  public void onPause()
  {
    AppMethodBeat.i(25338);
    super.onPause();
    cDG();
    AppMethodBeat.o(25338);
  }

  public void onResume()
  {
    AppMethodBeat.i(25337);
    super.onResume();
    AppMethodBeat.o(25337);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI
 * JD-Core Version:    0.6.2
 */