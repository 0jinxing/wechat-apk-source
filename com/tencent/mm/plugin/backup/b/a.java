package com.tencent.mm.plugin.backup.b;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class a
{
  private static String TAG = "MicroMsg.BackupBaseModel";
  private static LinkedList<a> jqD = new LinkedList();

  public static void a(a parama)
  {
    jqD.add(parama);
  }

  public static void aSo()
  {
    Iterator localIterator = jqD.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).aSp();
    jqD.clear();
  }

  public abstract void aSp();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.a
 * JD-Core Version:    0.6.2
 */