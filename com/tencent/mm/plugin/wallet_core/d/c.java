package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends j<Bankcard>
{
  public static final String[] fnj;
  public e bSd;
  private List<Object> bkF;

  static
  {
    AppMethodBeat.i(47071);
    fnj = new String[] { j.a(Bankcard.ccO, "WalletBankcard") };
    AppMethodBeat.o(47071);
  }

  public c(e parame)
  {
    super(parame, Bankcard.ccO, "WalletBankcard", null);
    AppMethodBeat.i(47059);
    this.bkF = new LinkedList();
    this.bSd = parame;
    AppMethodBeat.o(47059);
  }

  public final boolean apM()
  {
    AppMethodBeat.i(47067);
    boolean bool = this.bSd.hY("WalletBankcard", "delete from WalletBankcard");
    AppMethodBeat.o(47067);
    return bool;
  }

  public final ArrayList<Bankcard> cQB()
  {
    Bankcard localBankcard = null;
    Object localObject = null;
    AppMethodBeat.i(47060);
    Cursor localCursor = this.bSd.a("select * from WalletBankcard where cardType <= 7", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(47060);
    while (true)
    {
      return localObject;
      localObject = localBankcard;
      if (localCursor.moveToFirst())
      {
        localObject = new ArrayList();
        do
        {
          localBankcard = new Bankcard();
          localBankcard.d(localCursor);
          ((ArrayList)localObject).add(localBankcard);
        }
        while (localCursor.moveToNext());
      }
      localCursor.close();
      AppMethodBeat.o(47060);
    }
  }

  public final Bankcard cRc()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(47061);
    Object localObject3 = "select * from WalletBankcard where cardType & " + Bankcard.twI + " != 0 ";
    localObject3 = this.bSd.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(47061);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject2 = new Bankcard();
        ((Bankcard)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(47061);
    }
  }

  public final Bankcard cRd()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(47062);
    Object localObject3 = "select * from WalletBankcard where cardType & " + Bankcard.twL + " != 0 ";
    localObject3 = this.bSd.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(47062);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject2 = new Bankcard();
        ((Bankcard)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(47062);
    }
  }

  public final ArrayList<Bankcard> cRe()
  {
    Bankcard localBankcard = null;
    Object localObject1 = null;
    AppMethodBeat.i(47063);
    Object localObject2 = "select * from WalletBankcard where cardType & " + Bankcard.twH + " != 0 ";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(47063);
    while (true)
    {
      return localObject1;
      localObject1 = localBankcard;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localBankcard = new Bankcard();
          localBankcard.d((Cursor)localObject2);
          ((ArrayList)localObject1).add(localBankcard);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(47063);
    }
  }

  public final Bankcard cRf()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(47064);
    Object localObject3 = "select * from WalletBankcard where cardType & " + Bankcard.twJ + " != 0 ";
    localObject3 = this.bSd.a((String)localObject3, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(47064);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (((Cursor)localObject3).moveToNext())
      {
        localObject2 = new Bankcard();
        ((Bankcard)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(47064);
    }
  }

  public final boolean dU(List<Bankcard> paramList)
  {
    AppMethodBeat.i(47065);
    paramList = paramList.iterator();
    while (paramList.hasNext())
      super.b((Bankcard)paramList.next());
    paramList = this.bkF.iterator();
    while (paramList.hasNext())
      paramList.next();
    AppMethodBeat.o(47065);
    return true;
  }

  public final boolean f(Bankcard paramBankcard)
  {
    AppMethodBeat.i(47066);
    boolean bool;
    if (super.b(paramBankcard))
    {
      paramBankcard = this.bkF.iterator();
      while (paramBankcard.hasNext())
        paramBankcard.next();
      bool = true;
      AppMethodBeat.o(47066);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47066);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.c
 * JD-Core Version:    0.6.2
 */