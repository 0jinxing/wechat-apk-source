package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;

public abstract class jb
  implements Comparable<jb>
{
  public int a(jb paramjb)
  {
    Rect localRect = a();
    paramjb = paramjb.a();
    if (localRect.top != paramjb.top);
    for (int i = localRect.top - paramjb.top; ; i = localRect.left - paramjb.left)
      return i;
  }

  public abstract Rect a();

  public abstract String b();

  public abstract void c();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jb
 * JD-Core Version:    0.6.2
 */