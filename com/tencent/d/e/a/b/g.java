package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class g extends JceStruct
{
  static Map<Integer, ArrayList<f>> Aus;
  public int AtW = 0;
  public int AtX = 0;
  public int AtY = 0;
  public int AtZ = 0;
  public long Aup = 0L;
  public Map<Integer, ArrayList<f>> Auq = null;
  public int Aur = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114587);
    this.Aup = paramJceInputStream.read(this.Aup, 0, true);
    if (Aus == null)
    {
      Aus = new HashMap();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new f());
      Aus.put(Integer.valueOf(0), localArrayList);
    }
    this.Auq = ((Map)paramJceInputStream.read(Aus, 1, true));
    this.AtW = paramJceInputStream.read(this.AtW, 2, false);
    this.AtX = paramJceInputStream.read(this.AtX, 3, false);
    this.AtY = paramJceInputStream.read(this.AtY, 4, false);
    this.AtZ = paramJceInputStream.read(this.AtZ, 5, false);
    this.Aur = paramJceInputStream.read(this.Aur, 6, false);
    AppMethodBeat.o(114587);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114586);
    paramJceOutputStream.write(this.Aup, 0);
    paramJceOutputStream.write(this.Auq, 1);
    paramJceOutputStream.write(this.AtW, 2);
    paramJceOutputStream.write(this.AtX, 3);
    paramJceOutputStream.write(this.AtY, 4);
    paramJceOutputStream.write(this.AtZ, 5);
    if (this.Aur != 0)
      paramJceOutputStream.write(this.Aur, 6);
    AppMethodBeat.o(114586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.g
 * JD-Core Version:    0.6.2
 */