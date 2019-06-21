package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.a.a;

public class SelectSpecialContactUI extends MMBaseSelectContactUI
{
  private String title;
  private int zon;

  protected final void Kh()
  {
    AppMethodBeat.i(33916);
    super.Kh();
    this.title = getIntent().getStringExtra("titile");
    this.zon = getIntent().getIntExtra("list_attr", 0);
    AppMethodBeat.o(33916);
  }

  protected final m aoA()
  {
    return null;
  }

  protected final boolean aow()
  {
    return false;
  }

  protected final boolean aox()
  {
    return false;
  }

  protected final String aoy()
  {
    return this.title;
  }

  protected final o aoz()
  {
    AppMethodBeat.i(33918);
    aa localaa = new aa(this, getIntent().getStringExtra("filter_type"));
    AppMethodBeat.o(33918);
    return localaa;
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(33917);
    Object localObject = dHV().Pn(paramInt);
    if (localObject == null)
      AppMethodBeat.o(33917);
    while (true)
    {
      return;
      if (((a)localObject).ehM == null)
      {
        AppMethodBeat.o(33917);
      }
      else
      {
        String str = ((a)localObject).ehM.field_username;
        ab.i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", new Object[] { str });
        localObject = new Intent();
        if (s.hr(this.zon, 16384))
        {
          ((Intent)localObject).putExtra("Select_Contact", str);
          setResult(-1, (Intent)localObject);
          finish();
          AppMethodBeat.o(33917);
        }
        else if (s.hr(this.zon, 32768))
        {
          ((Intent)localObject).putExtra("Contact_User", str);
          d.b(this, "profile", ".ui.ContactInfoUI", (Intent)localObject);
          finish();
          AppMethodBeat.o(33917);
        }
        else
        {
          ((Intent)localObject).setClass(this, ChattingUI.class);
          ((Intent)localObject).putExtra("Chat_User", str);
          ((Intent)localObject).putExtra("finish_direct", true);
          startActivity((Intent)localObject);
          finish();
          AppMethodBeat.o(33917);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectSpecialContactUI
 * JD-Core Version:    0.6.2
 */