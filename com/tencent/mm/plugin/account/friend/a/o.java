package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class o extends j<n>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;
  public com.tencent.mm.sdk.e.n gvC;

  static
  {
    AppMethodBeat.i(108399);
    fnj = new String[] { j.a(n.ccO, "GoogleFriend") };
    AppMethodBeat.o(108399);
  }

  public o(e parame)
  {
    super(parame, n.ccO, "GoogleFriend", null);
    AppMethodBeat.i(108388);
    this.gvC = new o.1(this);
    this.bSd = parame;
    AppMethodBeat.o(108388);
  }

  private boolean a(n paramn)
  {
    boolean bool = false;
    AppMethodBeat.i(108389);
    if (paramn == null)
      AppMethodBeat.o(108389);
    while (true)
    {
      return bool;
      paramn = paramn.Hl();
      if ((int)this.bSd.insert("GoogleFriend", "googleitemid", paramn) > 0)
      {
        bool = true;
        AppMethodBeat.o(108389);
      }
      else
      {
        AppMethodBeat.o(108389);
      }
    }
  }

  private boolean wh(String paramString)
  {
    AppMethodBeat.i(108396);
    paramString = "SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    paramString = this.bSd.a(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    AppMethodBeat.o(108396);
    return bool;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean aj(String paramString, int paramInt)
  {
    AppMethodBeat.i(108394);
    paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' WHERE googleitemid='" + paramString + "'";
    boolean bool = this.bSd.hY("GoogleFriend", paramString);
    AppMethodBeat.o(108394);
    return bool;
  }

  public final boolean ak(String paramString, int paramInt)
  {
    AppMethodBeat.i(108395);
    boolean bool;
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' , status='0' WHERE username='" + paramString + "'";
      bool = this.bSd.hY("GoogleFriend", paramString);
      AppMethodBeat.o(108395);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108395);
    }
  }

  public final boolean b(n paramn)
  {
    boolean bool = true;
    AppMethodBeat.i(108393);
    if (!wh(paramn.field_googleitemid))
    {
      bool = a(paramn);
      AppMethodBeat.o(108393);
    }
    while (true)
    {
      return bool;
      ContentValues localContentValues = paramn.Hl();
      int i = this.bSd.update("GoogleFriend", localContentValues, "googleitemid=?", new String[] { paramn.field_googleitemid });
      if (i > 0)
        doNotify();
      if (i > 0)
      {
        AppMethodBeat.o(108393);
      }
      else
      {
        AppMethodBeat.o(108393);
        bool = false;
      }
    }
  }

  public final Cursor bi(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108391);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString1))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googlegmail!='" + paramString2 + "' AND ");
      localStringBuilder.append("GoogleFriend.googlename LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlenamepy LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlegmail LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.nickname LIKE '%" + paramString1 + "%' ) ");
    }
    while (true)
    {
      localStringBuilder.append(" GROUP BY googleid,contecttype");
      localStringBuilder.append(" ORDER BY status , googlenamepy ASC , usernamepy ASC");
      paramString1 = this.bSd.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder.toString(), null);
      AppMethodBeat.o(108391);
      return paramString1;
      localStringBuilder.append(" WHERE ( GoogleFriend.googlegmail!='" + paramString2 + "' )");
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(108397);
    this.bSd.hY("GoogleFriend", " delete from GoogleFriend");
    this.gvC.b(5, this.gvC, "");
    AppMethodBeat.o(108397);
  }

  public final String getTableName()
  {
    return "GoogleFriend";
  }

  public final boolean j(ArrayList<n> paramArrayList)
  {
    boolean bool = false;
    AppMethodBeat.i(108390);
    if (paramArrayList.size() <= 0)
    {
      ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "insertList . list is null.");
      AppMethodBeat.o(108390);
      return bool;
    }
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "surround insertList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      for (int i = 0; i < paramArrayList.size(); i++)
        a((n)paramArrayList.get(i));
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "end updateList transaction");
      }
      this.gvC.b(2, this.gvC, "");
      AppMethodBeat.o(108390);
      bool = true;
      break;
      l = -1L;
    }
  }

  public final Cursor wg(String paramString)
  {
    AppMethodBeat.i(108392);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googleid='" + paramString + "'");
      localStringBuilder.append(" ) ");
    }
    paramString = this.bSd.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  ".concat(String.valueOf(localStringBuilder)), null);
    AppMethodBeat.o(108392);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.o
 * JD-Core Version:    0.6.2
 */