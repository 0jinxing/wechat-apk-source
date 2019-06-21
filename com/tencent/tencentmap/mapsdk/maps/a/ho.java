package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class ho extends m
{
  static ArrayList<hp> g;
  public ArrayList<hp> a = null;
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public String f = "";

  static
  {
    AppMethodBeat.i(99564);
    g = new ArrayList();
    hp localhp = new hp();
    g.add(localhp);
    AppMethodBeat.o(99564);
  }

  public ho()
  {
  }

  public ho(ArrayList<hp> paramArrayList, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.a = paramArrayList;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
  }

  public final void readFrom(k paramk)
  {
    AppMethodBeat.i(99563);
    this.a = ((ArrayList)paramk.a(g, 0, true));
    this.b = paramk.a(1, false);
    this.c = paramk.a(2, false);
    this.d = paramk.a(3, false);
    this.e = paramk.a(4, false);
    this.f = paramk.a(5, false);
    AppMethodBeat.o(99563);
  }

  public final void writeTo(l paraml)
  {
    AppMethodBeat.i(99562);
    paraml.a(this.a, 0);
    if (this.b != null)
      paraml.a(this.b, 1);
    if (this.c != null)
      paraml.a(this.c, 2);
    if (this.d != null)
      paraml.a(this.d, 3);
    if (this.e != null)
      paraml.a(this.e, 4);
    if (this.f != null)
      paraml.a(this.f, 5);
    AppMethodBeat.o(99562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ho
 * JD-Core Version:    0.6.2
 */