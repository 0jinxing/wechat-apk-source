package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import java.util.ArrayList;
import java.util.List;

public final class ae
{
  public static ad a()
  {
    AppMethodBeat.i(98293);
    Object localObject = new ao();
    ((ao)localObject).o = ao.a;
    localObject = new ad((ao)localObject);
    AppMethodBeat.o(98293);
    return localObject;
  }

  public static ad a(float paramFloat)
  {
    AppMethodBeat.i(98296);
    Object localObject = new ao();
    ((ao)localObject).o = ao.d;
    ((ao)localObject).r = paramFloat;
    localObject = new ad((ao)localObject);
    AppMethodBeat.o(98296);
    return localObject;
  }

  public static ad a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(98295);
    Object localObject = new ao();
    ((ao)localObject).o = ao.c;
    ((ao)localObject).p = paramFloat1;
    ((ao)localObject).q = paramFloat2;
    localObject = new ad((ao)localObject);
    AppMethodBeat.o(98295);
    return localObject;
  }

  public static ad a(float paramFloat, Point paramPoint)
  {
    AppMethodBeat.i(98298);
    ao localao = new ao();
    localao.o = ao.f;
    localao.t = paramFloat;
    localao.u = paramPoint;
    paramPoint = new ad(localao);
    AppMethodBeat.o(98298);
    return paramPoint;
  }

  public static ad a(cp paramcp)
  {
    AppMethodBeat.i(98299);
    ao localao = new ao();
    localao.o = ao.g;
    localao.v = paramcp;
    paramcp = new ad(localao);
    AppMethodBeat.o(98299);
    return paramcp;
  }

  public static ad a(db paramdb)
  {
    AppMethodBeat.i(98300);
    ao localao = new ao();
    localao.o = ao.h;
    localao.w = paramdb;
    paramdb = new ad(localao);
    AppMethodBeat.o(98300);
    return paramdb;
  }

  public static ad a(db paramdb, float paramFloat)
  {
    AppMethodBeat.i(98301);
    ao localao = new ao();
    localao.o = ao.i;
    localao.x = paramdb;
    localao.y = paramFloat;
    paramdb = new ad(localao);
    AppMethodBeat.o(98301);
    return paramdb;
  }

  public static ad a(dc paramdc, int paramInt)
  {
    AppMethodBeat.i(98302);
    ao localao = new ao();
    localao.o = ao.j;
    localao.z = paramdc;
    localao.A = paramInt;
    paramdc = new ad(localao);
    AppMethodBeat.o(98302);
    return paramdc;
  }

  public static ad a(dc paramdc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(98303);
    ao localao = new ao();
    localao.o = ao.l;
    localao.B = paramdc;
    localao.F = paramInt1;
    localao.G = paramInt2;
    localao.H = paramInt3;
    localao.I = paramInt4;
    paramdc = new ad(localao);
    AppMethodBeat.o(98303);
    return paramdc;
  }

  public static ad a(dc paramdc, db paramdb, int paramInt)
  {
    AppMethodBeat.i(98304);
    if (paramdc == null)
    {
      paramdc = null;
      AppMethodBeat.o(98304);
    }
    while (true)
    {
      return paramdc;
      db localdb1 = paramdc.b;
      db localdb2 = ic.a(paramdb, localdb1);
      paramdc = paramdc.a;
      db localdb3 = ic.a(paramdb, paramdc);
      paramdb = new ArrayList();
      paramdb.add(localdb1);
      paramdb.add(localdb2);
      paramdb.add(paramdc);
      paramdb.add(localdb3);
      paramdc = a(new dc.a().a(paramdb).a(), paramInt);
      AppMethodBeat.o(98304);
    }
  }

  public static ad b()
  {
    AppMethodBeat.i(98294);
    Object localObject = new ao();
    ((ao)localObject).o = ao.b;
    localObject = new ad((ao)localObject);
    AppMethodBeat.o(98294);
    return localObject;
  }

  public static ad b(float paramFloat)
  {
    AppMethodBeat.i(98297);
    Object localObject = new ao();
    ((ao)localObject).o = ao.e;
    ((ao)localObject).s = paramFloat;
    localObject = new ad((ao)localObject);
    AppMethodBeat.o(98297);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ae
 * JD-Core Version:    0.6.2
 */