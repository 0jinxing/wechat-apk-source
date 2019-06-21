package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMBaseActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsSelectContactDialog extends MMBaseActivity
{
  private List<String> items;
  private GridView rvo;
  private SnsSelectContactDialog.a rvp;

  public SnsSelectContactDialog()
  {
    AppMethodBeat.i(39193);
    this.rvo = null;
    this.rvp = null;
    this.items = new LinkedList();
    AppMethodBeat.o(39193);
  }

  private boolean ZG(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(39196);
    String[] arrayOfString = t.fkY;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (paramString.equals(arrayOfString[j]))
        AppMethodBeat.o(39196);
    while (true)
    {
      return bool;
      j++;
      break;
      if (t.kH(paramString))
      {
        AppMethodBeat.o(39196);
      }
      else if (t.mZ(paramString))
      {
        AppMethodBeat.o(39196);
      }
      else if ((this.items != null) && (this.items.contains(paramString)))
      {
        AppMethodBeat.o(39196);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(39196);
      }
    }
  }

  private String ctJ()
  {
    AppMethodBeat.i(39197);
    Object localObject1 = ((j)g.K(j.class)).XR();
    String str = t.fkP;
    Object localObject2 = new LinkedList();
    Object localObject3 = t.fkY;
    int i = localObject3.length;
    for (int j = 0; j < i; j++)
      ((List)localObject2).add(localObject3[j]);
    ((List)localObject2).add("weixin");
    ((List)localObject2).add("officialaccounts");
    ((List)localObject2).add("helper_entry");
    ((List)localObject2).add("filehelper");
    localObject3 = ((be)localObject1).c(str, (List)localObject2, "*");
    if (((Cursor)localObject3).getCount() == 0)
    {
      ((Cursor)localObject3).close();
      localObject2 = "";
      AppMethodBeat.o(39197);
    }
    while (true)
    {
      return localObject2;
      localObject2 = new LinkedList();
      ((Cursor)localObject3).moveToFirst();
      do
      {
        localObject1 = new ak();
        ((ak)localObject1).d((Cursor)localObject3);
        if (ZG(((at)localObject1).field_username))
        {
          ((List)localObject2).add(((at)localObject1).field_username);
          if (((List)localObject2).size() >= 10)
            break;
        }
      }
      while (((Cursor)localObject3).moveToNext());
      ((Cursor)localObject3).close();
      localObject2 = bo.c((List)localObject2, ";");
      AppMethodBeat.o(39197);
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39198);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(39198);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(39198);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39198);
        break;
      }
      paramIntent = bo.P(paramIntent.getStringExtra("Select_Contact").split(","));
      if (paramIntent == null)
      {
        AppMethodBeat.o(39198);
        break;
      }
      if (this.items == null)
        this.items = new LinkedList();
      paramIntent = paramIntent.iterator();
      while (paramIntent.hasNext())
      {
        String str = (String)paramIntent.next();
        if (!this.items.contains(str))
          this.items.add(str);
      }
      ab.d("MicroMsg.SnsSelectContactDialog", "withList count " + this.items.size());
      if (this.rvp != null)
      {
        ab.d("MicroMsg.SnsSelectContactDialog", "refresh alertAdapter");
        this.rvp.refresh();
      }
      paramIntent = new Intent();
      paramIntent.putExtra("Select_Contact", bo.c(this.items, ","));
      setResult(-1, paramIntent);
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39194);
    super.onCreate(paramBundle);
    setContentView(2130970749);
    paramBundle = getIntent().getStringExtra("Select_Contact");
    if ((paramBundle == null) || (paramBundle.equals("")))
      this.items.clear();
    while (true)
    {
      this.rvo = ((GridView)findViewById(2131827692));
      this.rvp = new SnsSelectContactDialog.a(this, this, this.items);
      this.rvo.setAdapter(this.rvp);
      this.rvo.setOnItemClickListener(new SnsSelectContactDialog.1(this));
      this.rvo.setSelection(this.rvp.getCount() - 1);
      ((ImageButton)findViewById(2131827693)).setOnClickListener(new SnsSelectContactDialog.2(this));
      AppMethodBeat.o(39194);
      return;
      this.items = bo.P(paramBundle.split(","));
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39195);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Select_Contact", bo.c(this.items, ","));
      setResult(-1, localIntent);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(39195);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class b
  {
    ImageView image;
    ImageView rvr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSelectContactDialog
 * JD-Core Version:    0.6.2
 */