package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.sdk.e.h;
import java.util.List;

public abstract interface bd extends h
{
  public abstract int F(String paramString, byte[] paramArrayOfByte);

  public abstract void W(ad paramad);

  public abstract boolean X(ad paramad);

  public abstract boolean Y(ad paramad);

  public abstract boolean Z(ad paramad);

  public abstract Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2);

  public abstract Cursor a(List<String> paramList1, String paramString, List<String> paramList2);

  public abstract Cursor a(String[] paramArrayOfString, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2);

  public abstract Cursor a(String[] paramArrayOfString, String paramString, List<String> paramList);

  public abstract void a(a parama);

  public abstract int aa(ad paramad);

  public abstract String aet();

  public abstract ad aoI(String paramString);

  public abstract boolean aoJ(String paramString);

  public abstract ad aoK(String paramString);

  public abstract Cursor aoL(String paramString);

  public abstract ad aoM(String paramString);

  public abstract ad aoN(String paramString);

  public abstract ad aoO(String paramString);

  public abstract long aoP(String paramString);

  public abstract boolean aoQ(String paramString);

  public abstract boolean aoR(String paramString);

  public abstract byte[] aoS(String paramString);

  public abstract int aoT(String paramString);

  public abstract int aoU(String paramString);

  public abstract String aoV(String paramString);

  public abstract int b(String paramString, ad paramad);

  public abstract int b(String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract Cursor b(String paramString1, String paramString2, List<String> paramList);

  public abstract Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2);

  public abstract Cursor b(List<String> paramList1, String paramString, List<String> paramList2);

  public abstract void b(a parama);

  public abstract int[] b(String paramString1, String paramString2, String paramString3, List<String> paramList);

  public abstract int[] b(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList);

  public abstract int c(String paramString, ad paramad);

  public abstract int c(String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract Cursor c(String paramString1, String paramString2, List<String> paramList);

  public abstract Cursor c(List<String> paramList1, String paramString, List<String> paramList2);

  public abstract int[] c(String paramString1, String paramString2, String paramString3, List<String> paramList);

  public abstract int[] c(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList);

  public abstract Cursor d(String paramString1, String paramString2, List<String> paramList);

  public abstract void d(String paramString, ad paramad);

  public abstract Cursor dsF();

  public abstract Cursor dsG();

  public abstract Cursor dsH();

  public abstract List<String> dsq();

  public abstract List<String> dsr();

  public abstract Cursor dss();

  public abstract Cursor dst();

  public abstract Cursor dsu();

  public abstract Cursor dsv();

  public abstract int dsw();

  public abstract String e(String paramString1, String paramString2, List<String> paramList);

  public abstract Cursor eA(List<String> paramList);

  public abstract Cursor eB(List<String> paramList);

  public abstract Cursor eC(List<String> paramList);

  public abstract Cursor eD(List<String> paramList);

  public abstract List<String> eE(List<String> paramList);

  public abstract int[] eF(List<String> paramList);

  public abstract int[] eG(List<String> paramList);

  public abstract Cursor eu(List<String> paramList);

  public abstract Cursor ev(List<String> paramList);

  public abstract Cursor ew(List<String> paramList);

  public abstract Cursor ex(List<String> paramList);

  public abstract Cursor k(List<String> paramList, boolean paramBoolean);

  public abstract ad mQ(long paramLong);

  public static abstract interface a
  {
    public abstract void a(bd parambd, ad paramad);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bd
 * JD-Core Version:    0.6.2
 */