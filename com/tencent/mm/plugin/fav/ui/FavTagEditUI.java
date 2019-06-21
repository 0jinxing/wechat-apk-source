package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.a.d;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FavTagEditUI extends MMActivity
{
  private com.tencent.mm.plugin.fav.a.g mjP;
  private List<String> mjQ;
  private FavTagPanel mjR;
  private FavTagPanel mjS;
  private ListView mjT;
  private ListView mjU;
  private TextView mjV;
  private c mjW;
  private d mjX;
  private boolean mjY;

  public static void a(com.tencent.mm.plugin.fav.a.g paramg, Collection<String> paramCollection, int paramInt)
  {
    AppMethodBeat.i(74158);
    if (paramg == null)
    {
      AppMethodBeat.o(74158);
      return;
    }
    ab.d("MicroMsg.FavTagEditUI", "mod tags %s", new Object[] { paramCollection });
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(paramg.field_tagProto.wiJ);
    paramg.field_tagProto.wiJ.clear();
    if ((paramCollection == null) || (paramCollection.isEmpty()));
    while (true)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      b.p(paramg);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().e(localHashSet);
      b.a(paramg, paramInt);
      AppMethodBeat.o(74158);
      break;
      paramg.field_tagProto.wiJ.addAll(paramCollection);
      localHashSet.removeAll(paramCollection);
    }
  }

  private void bvN()
  {
    AppMethodBeat.i(74154);
    if (this.mjY)
    {
      ab.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
      if (dxX())
        enableOptionMenu(0, false);
      AppMethodBeat.o(74154);
    }
    while (true)
    {
      return;
      if (this.mjP == null)
      {
        if ((this.mjS.getTagCount() <= 0) && (this.mjS.getEditText().length() <= 0))
        {
          if (dxX())
          {
            enableOptionMenu(0, false);
            AppMethodBeat.o(74154);
          }
        }
        else if (!dxX())
        {
          enableOptionMenu(0, true);
          AppMethodBeat.o(74154);
        }
      }
      else if ((this.mjP.field_tagProto.wiJ.size() != this.mjS.getTagCount()) || (this.mjS.getEditText().length() > 0))
      {
        if (!dxX())
        {
          enableOptionMenu(0, true);
          AppMethodBeat.o(74154);
        }
      }
      else
      {
        ArrayList localArrayList = this.mjS.getTagList();
        for (int i = 0; ; i++)
        {
          if (i >= localArrayList.size())
            break label248;
          if (!((String)localArrayList.get(i)).equals(this.mjP.field_tagProto.wiJ.get(i)))
          {
            if (!dxX())
              enableOptionMenu(0, true);
            AppMethodBeat.o(74154);
            break;
          }
        }
        label248: if (dxX())
          enableOptionMenu(0, false);
        AppMethodBeat.o(74154);
      }
    }
  }

  private void bvO()
  {
    AppMethodBeat.i(74157);
    h.d(this.mController.ylL, getString(2131299692), "", getString(2131296526), getString(2131296868), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(74140);
        FavTagEditUI.this.finish();
        AppMethodBeat.o(74140);
      }
    }
    , null);
    AppMethodBeat.o(74157);
  }

  public final int getLayoutId()
  {
    return 2130969526;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74153);
    super.onCreate(paramBundle);
    long l = getIntent().getLongExtra("key_fav_item_id", -1L);
    if (-1L != l)
      this.mjP = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
    this.mjQ = getIntent().getStringArrayListExtra("key_fav_result_list");
    this.mjS = ((FavTagPanel)findViewById(2131823966));
    this.mjT = ((ListView)findViewById(2131823968));
    this.mjU = ((ListView)findViewById(2131823973));
    this.mjV = ((TextView)findViewById(2131823972));
    this.mjS.qe(true);
    this.mjS.setTagEditTextBG(2130840373);
    this.mjS.setIsAllowEnterCharacter(true);
    this.mjS.setCallBack(new FavTagEditUI.5(this));
    this.mjS.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(74146);
        FavTagEditUI.d(FavTagEditUI.this).dAc();
        FavTagEditUI.this.showVKB();
        AppMethodBeat.o(74146);
      }
    }
    , 100L);
    Object localObject;
    if (this.mjP != null)
    {
      this.mjS.a(this.mjP.field_tagProto.wiJ, this.mjP.field_tagProto.wiJ);
      this.mjW = new FavTagEditUI.7(this, this.mController.ylL);
      localObject = this.mjW;
      if (this.mjP != null)
        break label645;
    }
    label645: for (paramBundle = null; ; paramBundle = this.mjP.field_tagProto.wiJ)
    {
      ((c)localObject).bQ(paramBundle);
      if ((this.mjP != null) && (!this.mjP.field_tagProto.wiI.isEmpty()))
      {
        localObject = View.inflate(this.mController.ylL, 2130969530, null);
        paramBundle = (TextView)((View)localObject).findViewById(2131823978);
        paramBundle.setText(getString(2131299693));
        paramBundle.setVisibility(0);
        int i = getResources().getDimensionPixelSize(2131427664);
        this.mjR = ((FavTagPanel)((View)localObject).findViewById(2131823979));
        this.mjR.setVisibility(0);
        this.mjR.a(this.mjP.field_tagProto.wiJ, this.mjP.field_tagProto.wiI);
        this.mjR.setBackgroundResource(2130839171);
        this.mjR.setPadding(0, 0, 0, i);
        this.mjR.setCallBack(new FavTagEditUI.8(this));
        this.mjT.addHeaderView((View)localObject);
      }
      if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().buE() > 0)
        this.mjT.addHeaderView(View.inflate(this.mController.ylL, 2130969529, null));
      this.mjT.setAdapter(this.mjW);
      this.mjT.setOnTouchListener(new FavTagEditUI.9(this));
      this.mjX = new FavTagEditUI.10(this, this.mController.ylL);
      this.mjU.setAdapter(this.mjX);
      this.mjU.setOnTouchListener(new FavTagEditUI.2(this));
      setMMTitle(2131299612);
      setBackBtn(new FavTagEditUI.1(this));
      a(0, getString(2131296944), new FavTagEditUI.3(this, l), q.b.ymu);
      bvN();
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().a(this.mjW);
      AppMethodBeat.o(74153);
      return;
      if (this.mjQ == null)
        break;
      this.mjS.a(this.mjQ, this.mjQ);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74155);
    super.onDestroy();
    l locall = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr();
    c localc = this.mjW;
    if (localc == null)
      AppMethodBeat.o(74155);
    while (true)
    {
      return;
      locall.fBy.remove(localc.toString());
      AppMethodBeat.o(74155);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(74156);
    boolean bool;
    if (paramInt == 4)
    {
      bvO();
      bool = true;
      AppMethodBeat.o(74156);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(74156);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI
 * JD-Core Version:    0.6.2
 */