package com.tencent.mm.storage;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.vending.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract interface be extends com.tencent.mm.sdk.e.h
{
  public abstract Cursor A(String paramString, List<String> paramList);

  public abstract b Cb();

  public abstract boolean MV(String paramString);

  public abstract int a(ak paramak, String paramString);

  public abstract int a(ak paramak, String paramString, boolean paramBoolean);

  public abstract Cursor a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean);

  public abstract Cursor a(String paramString1, List<String> paramList, boolean paramBoolean, String paramString2);

  public abstract Cursor a(ArrayList<String> paramArrayList, String paramString1, List<String> paramList, String paramString2);

  public abstract b a(f paramf);

  public abstract void a(e parame);

  public abstract void a(ak paramak, int paramInt1, int paramInt2);

  public abstract void a(a parama);

  public abstract void a(b paramb);

  public abstract boolean a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2);

  public abstract void aF(LinkedList<String> paramLinkedList);

  public abstract String ac(int paramInt, String paramString);

  public abstract void aoX(String paramString);

  public abstract boolean aoY(String paramString);

  public abstract ak aoZ(String paramString);

  public abstract void apa(String paramString);

  public abstract boolean apb(String paramString);

  public abstract boolean apc(String paramString);

  public abstract boolean apd(String paramString);

  public abstract boolean ape(String paramString);

  public abstract boolean apf(String paramString);

  public abstract boolean apg(String paramString);

  public abstract boolean aph(String paramString);

  public abstract Cursor api(String paramString);

  public abstract Cursor apj(String paramString);

  public abstract Cursor apk(String paramString);

  public abstract int apl(String paramString);

  public abstract String apm(String paramString);

  public abstract ak apn(String paramString);

  public abstract int apo(String paramString);

  public abstract void app(String paramString);

  public abstract void apq(String paramString);

  public abstract int apr(String paramString);

  public abstract void aq(bi parambi);

  public abstract void b(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh, h.c paramc);

  public abstract void b(a parama);

  public abstract Cursor c(String paramString1, List<String> paramList, String paramString2);

  public abstract void c(a parama);

  public abstract void c(String[] paramArrayOfString, String paramString);

  public abstract long d(ak paramak);

  public abstract void d(a parama);

  public abstract boolean dsJ();

  public abstract HashMap<String, Long> dsK();

  public abstract void dsL();

  public abstract List<String> dsN();

  public abstract List<String> dsO();

  public abstract Cursor dsP();

  public abstract int dsQ();

  public abstract String dsR();

  public abstract Cursor dsS();

  public abstract ak dsT();

  public abstract Cursor dsU();

  public abstract Cursor eo(String paramString, int paramInt);

  public abstract boolean f(ak paramak);

  public abstract boolean g(ak paramak);

  public abstract Cursor ic(String paramString1, String paramString2);

  public abstract int nR(String paramString);

  public abstract Cursor t(List<String> paramList, int paramInt);

  public static abstract interface a
  {
    public abstract void a(ak paramak, be parambe);
  }

  public static abstract interface b
  {
    public abstract String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext);

    public abstract void a(bi parambi, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.be
 * JD-Core Version:    0.6.2
 */