package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.contact.s;

public class SnsTagPartlyUI extends MMActivity
  implements f
{
  private ListView gGW;
  private SnsTagPartlyUI.a rxF;
  private View.OnClickListener rxG;
  protected com.tencent.mm.ui.base.p tipDialog;

  public SnsTagPartlyUI()
  {
    AppMethodBeat.i(39386);
    this.tipDialog = null;
    this.rxG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(39380);
        if (SnsTagPartlyUI.a(SnsTagPartlyUI.this) == null)
        {
          ab.e("MicroMsg.SnsTagPartlyUI", "The adapter is null..");
          AppMethodBeat.o(39380);
        }
        while (true)
        {
          return;
          paramAnonymousView = paramAnonymousView.getTag();
          if (paramAnonymousView == null)
          {
            ab.e("MicroMsg.SnsTagPartlyUI", "The tag is null..");
            AppMethodBeat.o(39380);
          }
          else if (!(paramAnonymousView instanceof Integer))
          {
            ab.e("MicroMsg.SnsTagPartlyUI", "The tag is not a instance of Integer.");
            AppMethodBeat.o(39380);
          }
          else
          {
            paramAnonymousView = (t)SnsTagPartlyUI.a(SnsTagPartlyUI.this).getItem(((Integer)paramAnonymousView).intValue());
            SnsTagPartlyUI.this.tipDialog = h.b(SnsTagPartlyUI.this, null, true, new SnsTagPartlyUI.5.1(this));
            g.RQ();
            g.RO().eJo.a(new x(paramAnonymousView.field_tagId, paramAnonymousView.field_tagName), 0);
            AppMethodBeat.o(39380);
          }
        }
      }
    };
    AppMethodBeat.o(39386);
  }

  public final int getLayoutId()
  {
    return 2130970809;
  }

  public final void initView()
  {
    AppMethodBeat.i(39390);
    setMMTitle(2131303222);
    setBackBtn(new SnsTagPartlyUI.1(this));
    this.gGW = ((ListView)findViewById(2131827865));
    this.gGW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(39377);
        if (paramAnonymousInt < SnsTagPartlyUI.a(SnsTagPartlyUI.this).getCount() - 1)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousView = (t)SnsTagPartlyUI.a(SnsTagPartlyUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousView == null)
            AppMethodBeat.o(39377);
        }
        while (true)
        {
          return;
          paramAnonymousAdapterView.putExtra("k_sns_tag_id", paramAnonymousView.field_tagId);
          paramAnonymousAdapterView.setClass(SnsTagPartlyUI.this, SnsTagDetailUI.class);
          SnsTagPartlyUI.this.startActivity(paramAnonymousAdapterView);
          AppMethodBeat.o(39377);
          continue;
          paramAnonymousView = new Intent();
          paramAnonymousAdapterView = r.Yz();
          paramAnonymousView.putExtra("titile", SnsTagPartlyUI.this.getString(2131296481));
          paramAnonymousView.putExtra("list_type", 1);
          paramAnonymousView.putExtra("KBlockOpenImFav", true);
          paramAnonymousView.putExtra("list_attr", s.hs(s.C(new int[] { s.znF, 1024 }), 16777216));
          paramAnonymousView.putExtra("block_contact", paramAnonymousAdapterView);
          d.b(SnsTagPartlyUI.this, ".ui.contact.SelectContactUI", paramAnonymousView, 1);
          AppMethodBeat.o(39377);
        }
      }
    });
    this.rxF = new SnsTagPartlyUI.a(this, this);
    View localView = View.inflate(this, 2130970808, null);
    this.gGW.addFooterView(localView);
    this.gGW.setAdapter(this.rxF);
    addTextOptionMenu(0, getString(2131303801), new SnsTagPartlyUI.3(this));
    this.rxF.a(new SnsTagPartlyUI.4(this));
    AppMethodBeat.o(39390);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39391);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(39391);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(39391);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39391);
        break;
      }
      String str = paramIntent.getStringExtra("Select_Contact");
      paramIntent = paramIntent.getStringExtra("Select_room_name");
      if (str == null)
      {
        AppMethodBeat.o(39391);
        break;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 0);
      localIntent.putExtra("k_sns_tag_name", bo.bc(paramIntent, ""));
      localIntent.putExtra("k_sns_tag_list", str);
      localIntent.setClass(this, SnsTagDetailUI.class);
      startActivity(localIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39387);
    super.onCreate(paramBundle);
    g.RQ();
    g.RO().eJo.a(292, this);
    g.RQ();
    g.RO().eJo.a(290, this);
    initView();
    AppMethodBeat.o(39387);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39388);
    g.RQ();
    g.RO().eJo.b(292, this);
    g.RQ();
    g.RO().eJo.b(290, this);
    if (this.rxF != null)
      this.rxF.bIf();
    super.onDestroy();
    AppMethodBeat.o(39388);
  }

  public void onResume()
  {
    AppMethodBeat.i(39389);
    super.onResume();
    if (this.rxF != null)
      this.rxF.a("", null);
    AppMethodBeat.o(39389);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39392);
    ab.i("MicroMsg.SnsTagPartlyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (this.rxF != null)
      this.rxF.a("", null);
    AppMethodBeat.o(39392);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a$a
  {
    Button gzI;
    TextView rxK;
    TextView rxL;

    a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI
 * JD-Core Version:    0.6.2
 */