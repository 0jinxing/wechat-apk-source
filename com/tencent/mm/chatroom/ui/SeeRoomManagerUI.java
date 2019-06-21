package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.c.b;
import com.tencent.mm.chatroom.c.d;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

public class SeeRoomManagerUI extends MMActivity
  implements k.a
{
  private u eih;
  private String ejR;
  private SeeRoomManagerUI.b elL;
  private GridView ely;
  private p tipDialog;

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(104300);
    if (paramm != null)
      ab.i("MicroMsg.SeeRoomManagerUI", "[onNotifyChange] event:%s [%s:%s]", new Object[] { paramString, paramm.ctq, Integer.valueOf(paramm.hsh) });
    AppMethodBeat.o(104300);
  }

  protected final c ce(View paramView)
  {
    AppMethodBeat.i(104301);
    c localc = new c();
    localc.ejo = ((ImageView)paramView.findViewById(2131827163));
    localc.elJ = ((TextView)paramView.findViewById(2131827168));
    AppMethodBeat.o(104301);
    return localc;
  }

  public final int getLayoutId()
  {
    return 2130970581;
  }

  public final void initView()
  {
    AppMethodBeat.i(104299);
    super.initView();
    setMMTitle(2131302566);
    this.ely = ((GridView)findViewById(2131827305));
    this.elL = new SeeRoomManagerUI.b(this, this);
    this.ely.setAdapter(this.elL);
    this.ely.setOnTouchListener(new SeeRoomManagerUI.1(this));
    this.ely.post(new SeeRoomManagerUI.2(this));
    setBackBtn(new SeeRoomManagerUI.3(this));
    AppMethodBeat.o(104299);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104302);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    if ((paramIntent == null) || (paramInt2 != -1))
      if (paramIntent == null)
      {
        bool = true;
        ab.w("MicroMsg.SeeRoomManagerUI", "[onActivityResult] data is null? %s resultCode:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(104302);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      ab.i("MicroMsg.SeeRoomManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", new Object[] { this.ejR, Integer.valueOf(paramInt1), paramIntent });
      if (!bo.isNullOrNil(paramIntent))
        break label131;
      ab.e("MicroMsg.SeeRoomManagerUI", "[onActivityResult] userListString is null!");
      AppMethodBeat.o(104302);
    }
    label131: Object localObject = paramIntent.split(",");
    paramIntent = new LinkedList();
    int i = localObject.length;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
      paramIntent.add(localObject[paramInt2]);
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(104302);
      break;
      localObject = this.mController.ylL;
      getString(2131297061);
      this.tipDialog = h.b((Context)localObject, getString(2131302502), false, null);
      new b(this.ejR, paramIntent).acy().b(this).b(new SeeRoomManagerUI.4(this, paramIntent));
      AppMethodBeat.o(104302);
      break;
      localObject = this.mController.ylL;
      getString(2131297061);
      this.tipDialog = h.b((Context)localObject, getString(2131302523), false, null);
      new d(this.ejR, paramIntent).acy().b(this).b(new SeeRoomManagerUI.5(this, paramIntent));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104297);
    super.onCreate(paramBundle);
    ((c)g.K(c.class)).XV().c(this);
    this.ejR = getIntent().getStringExtra("RoomInfo_Id");
    initView();
    AppMethodBeat.o(104297);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104298);
    super.onDestroy();
    ((c)g.K(c.class)).XV().d(this);
    AppMethodBeat.o(104298);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final class a
  {
    public ad ehM;
    public int type;

    public a(int paramad, ad arg3)
    {
      this.type = paramad;
      Object localObject;
      this.ehM = localObject;
    }
  }

  final class c
  {
    public ImageView ejo;
    public TextView elJ;

    c()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI
 * JD-Core Version:    0.6.2
 */