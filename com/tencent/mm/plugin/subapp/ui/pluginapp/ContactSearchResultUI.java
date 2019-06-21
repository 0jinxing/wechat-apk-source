package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ContactSearchResultUI extends MMActivity
{
  private static ak feP;
  private LinkedList<but> fjr;
  private ListView svg;
  private ContactSearchResultUI.a svh;
  private LinkedList<bvk> svi;
  private Map<String, ContactSearchResultUI.b> svj;

  static
  {
    AppMethodBeat.i(25524);
    feP = new ak(Looper.getMainLooper());
    AppMethodBeat.o(25524);
  }

  public ContactSearchResultUI()
  {
    AppMethodBeat.i(25519);
    this.fjr = new LinkedList();
    this.svi = new LinkedList();
    AppMethodBeat.o(25519);
  }

  public final int getLayoutId()
  {
    return 2130969239;
  }

  public final void initView()
  {
    AppMethodBeat.i(25521);
    setMMTitle(2131298763);
    setBackBtn(new ContactSearchResultUI.1(this));
    this.svj = new HashMap();
    this.svg = ((ListView)findViewById(2131823139));
    Object localObject = (TextView)findViewById(2131821749);
    this.svg.setEmptyView((View)localObject);
    localObject = getIntent().getByteArrayExtra("result");
    int i = getIntent().getIntExtra("add_more_friend_search_scene", 0);
    if (localObject != null);
    try
    {
      buv localbuv = new com/tencent/mm/protocal/protobuf/buv;
      localbuv.<init>();
      localbuv = (buv)localbuv.parseFrom((byte[])localObject);
      if (localbuv != null)
      {
        this.fjr = localbuv.woe;
        this.svi = localbuv.wWn;
      }
      if ((this.fjr.size() == 0) && (this.svi.isEmpty()))
      {
        AppMethodBeat.o(25521);
        return;
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ContactSearchResultUI", localException2, "SearchContactResponse", new Object[0]);
        try
        {
          bvk localbvk = new com/tencent/mm/protocal/protobuf/bvk;
          localbvk.<init>();
          localObject = (bvk)localbvk.parseFrom((byte[])localObject);
          this.svi.add(localObject);
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.ContactSearchResultUI", localException1, "SearchOpenIMContactItem", new Object[0]);
        }
        continue;
        this.svh = new ContactSearchResultUI.a(this, this);
        this.svg.setAdapter(this.svh);
        this.svg.setOnItemClickListener(new ContactSearchResultUI.2(this, i));
        this.svg.setOnScrollListener(new a());
        AppMethodBeat.o(25521);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25520);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(25520);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25522);
    o.acv().cancel();
    if (this.svj != null)
      this.svj.clear();
    super.onDestroy();
    AppMethodBeat.o(25522);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI
 * JD-Core Version:    0.6.2
 */