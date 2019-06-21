package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.b.a;
import com.tencent.mm.plugin.downloader.b.a.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static LinkedList<d.a> kOK;
  private static LinkedList<d.b> kOL;
  private static LinkedList<d.c> kOM;
  private static LinkedList<d.f> kON;
  private static LinkedList<d.e> kOO;
  private static LinkedList<d.d> kOP;
  private static LinkedList<g> kOQ;
  private static a.b kOR;

  static
  {
    AppMethodBeat.i(136134);
    kOK = new LinkedList();
    kOL = new LinkedList();
    kOM = new LinkedList();
    kON = new LinkedList();
    kOO = new LinkedList();
    kOP = new LinkedList();
    kOQ = new LinkedList();
    AppMethodBeat.o(136134);
  }

  public static void IF(String paramString)
  {
    AppMethodBeat.i(136126);
    Iterator localIterator = kON.iterator();
    while (localIterator.hasNext())
      ((d.f)localIterator.next()).IJ(paramString);
    AppMethodBeat.o(136126);
  }

  public static void IG(String paramString)
  {
    AppMethodBeat.i(136129);
    Iterator localIterator = kOO.iterator();
    while (localIterator.hasNext())
      ((d.e)localIterator.next()).II(paramString);
    AppMethodBeat.o(136129);
  }

  public static void IH(String paramString)
  {
    AppMethodBeat.i(136132);
    Iterator localIterator = kOQ.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).IK(paramString);
    AppMethodBeat.o(136132);
  }

  public static void a(d.a parama)
  {
    AppMethodBeat.i(136115);
    kOK.add(parama);
    AppMethodBeat.o(136115);
  }

  public static void a(d.b paramb)
  {
    AppMethodBeat.i(136118);
    kOL.add(paramb);
    AppMethodBeat.o(136118);
  }

  public static void a(d.c paramc)
  {
    AppMethodBeat.i(136121);
    kOM.add(paramc);
    AppMethodBeat.o(136121);
  }

  public static void a(d.d paramd)
  {
    AppMethodBeat.i(136113);
    if (!kOP.contains(paramd))
      kOP.add(paramd);
    AppMethodBeat.o(136113);
  }

  public static void a(d.e parame)
  {
    AppMethodBeat.i(136127);
    if (!kOO.contains(parame))
      kOO.add(parame);
    AppMethodBeat.o(136127);
  }

  public static void a(d.f paramf)
  {
    AppMethodBeat.i(136124);
    kON.add(paramf);
    AppMethodBeat.o(136124);
  }

  public static void a(g paramg)
  {
    AppMethodBeat.i(136130);
    if (!kOQ.contains(paramg))
      kOQ.add(paramg);
    AppMethodBeat.o(136130);
  }

  public static void b(d.a parama)
  {
    AppMethodBeat.i(136116);
    kOK.remove(parama);
    AppMethodBeat.o(136116);
  }

  public static void b(d.b paramb)
  {
    AppMethodBeat.i(136119);
    kOL.remove(paramb);
    AppMethodBeat.o(136119);
  }

  public static void b(d.c paramc)
  {
    AppMethodBeat.i(136122);
    kOM.remove(paramc);
    AppMethodBeat.o(136122);
  }

  public static void b(d.d paramd)
  {
    AppMethodBeat.i(136114);
    kOP.remove(paramd);
    AppMethodBeat.o(136114);
  }

  public static void b(d.e parame)
  {
    AppMethodBeat.i(136128);
    kOO.remove(parame);
    AppMethodBeat.o(136128);
  }

  public static void b(d.f paramf)
  {
    AppMethodBeat.i(136125);
    kON.remove(paramf);
    AppMethodBeat.o(136125);
  }

  public static void b(g paramg)
  {
    AppMethodBeat.i(136131);
    kOQ.remove(paramg);
    AppMethodBeat.o(136131);
  }

  public static void bgr()
  {
    AppMethodBeat.i(136111);
    a.b(kOR);
    kOR = null;
    kOK.clear();
    kOL.clear();
    kOM.clear();
    kON.clear();
    kOO.clear();
    kOP.clear();
    AppMethodBeat.o(136111);
  }

  public static void biJ()
  {
    AppMethodBeat.i(136120);
    Iterator localIterator = kOL.iterator();
    while (localIterator.hasNext())
      ((d.b)localIterator.next()).onClick();
    AppMethodBeat.o(136120);
  }

  public static void bie()
  {
    AppMethodBeat.i(136110);
    if (kOR == null)
      kOR = new d.1();
    a.a(kOR);
    AppMethodBeat.o(136110);
  }

  public static void ge(boolean paramBoolean)
  {
    AppMethodBeat.i(136117);
    Iterator localIterator = kOK.iterator();
    while (localIterator.hasNext())
      ((d.a)localIterator.next()).gg(paramBoolean);
    AppMethodBeat.o(136117);
  }

  public static void gf(boolean paramBoolean)
  {
    AppMethodBeat.i(136123);
    Iterator localIterator = kOM.iterator();
    while (localIterator.hasNext())
      ((d.c)localIterator.next()).gh(paramBoolean);
    AppMethodBeat.o(136123);
  }

  public static void hD(long paramLong)
  {
    AppMethodBeat.i(136112);
    Iterator localIterator = kOP.iterator();
    while (localIterator.hasNext())
      ((d.d)localIterator.next()).E(5, paramLong);
    AppMethodBeat.o(136112);
  }

  public static abstract interface g
  {
    public abstract void IK(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.d
 * JD-Core Version:    0.6.2
 */