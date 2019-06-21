package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class a
{
  public static final int aVH = v.aT("ftyp");
  public static final int aVI = v.aT("avc1");
  public static final int aVJ = v.aT("avc3");
  public static final int aVK = v.aT("hvc1");
  public static final int aVL = v.aT("hev1");
  public static final int aVM = v.aT("s263");
  public static final int aVN = v.aT("d263");
  public static final int aVO = v.aT("mdat");
  public static final int aVP = v.aT("mp4a");
  public static final int aVQ = v.aT(".mp3");
  public static final int aVR = v.aT("wave");
  public static final int aVS = v.aT("lpcm");
  public static final int aVT = v.aT("sowt");
  public static final int aVU = v.aT("ac-3");
  public static final int aVV = v.aT("dac3");
  public static final int aVW = v.aT("ec-3");
  public static final int aVX = v.aT("dec3");
  public static final int aVY = v.aT("dtsc");
  public static final int aVZ = v.aT("dtsh");
  public static final int aWA = v.aT("stsd");
  public static final int aWB = v.aT("pssh");
  public static final int aWC = v.aT("sinf");
  public static final int aWD = v.aT("schm");
  public static final int aWE = v.aT("schi");
  public static final int aWF = v.aT("tenc");
  public static final int aWG = v.aT("encv");
  public static final int aWH = v.aT("enca");
  public static final int aWI = v.aT("frma");
  public static final int aWJ = v.aT("saiz");
  public static final int aWK = v.aT("saio");
  public static final int aWL = v.aT("sbgp");
  public static final int aWM = v.aT("sgpd");
  public static final int aWN = v.aT("uuid");
  public static final int aWO = v.aT("senc");
  public static final int aWP = v.aT("pasp");
  public static final int aWQ = v.aT("TTML");
  public static final int aWR = v.aT("vmhd");
  public static final int aWS = v.aT("mp4v");
  public static final int aWT = v.aT("stts");
  public static final int aWU = v.aT("stss");
  public static final int aWV = v.aT("ctts");
  public static final int aWW = v.aT("stsc");
  public static final int aWX = v.aT("stsz");
  public static final int aWY = v.aT("stz2");
  public static final int aWZ = v.aT("stco");
  public static final int aWa = v.aT("dtsl");
  public static final int aWb = v.aT("dtse");
  public static final int aWc = v.aT("ddts");
  public static final int aWd = v.aT("tfdt");
  public static final int aWe = v.aT("tfhd");
  public static final int aWf = v.aT("trex");
  public static final int aWg = v.aT("trun");
  public static final int aWh = v.aT("sidx");
  public static final int aWi = v.aT("moov");
  public static final int aWj = v.aT("mvhd");
  public static final int aWk = v.aT("trak");
  public static final int aWl = v.aT("mdia");
  public static final int aWm = v.aT("minf");
  public static final int aWn = v.aT("stbl");
  public static final int aWo = v.aT("avcC");
  public static final int aWp = v.aT("hvcC");
  public static final int aWq = v.aT("esds");
  public static final int aWr = v.aT("moof");
  public static final int aWs = v.aT("traf");
  public static final int aWt = v.aT("mvex");
  public static final int aWu = v.aT("mehd");
  public static final int aWv = v.aT("tkhd");
  public static final int aWw = v.aT("edts");
  public static final int aWx = v.aT("elst");
  public static final int aWy = v.aT("mdhd");
  public static final int aWz = v.aT("hdlr");
  public static final int aXa = v.aT("co64");
  public static final int aXb = v.aT("tx3g");
  public static final int aXc = v.aT("wvtt");
  public static final int aXd = v.aT("stpp");
  public static final int aXe = v.aT("c608");
  public static final int aXf = v.aT("samr");
  public static final int aXg = v.aT("sawb");
  public static final int aXh = v.aT("udta");
  public static final int aXi = v.aT("meta");
  public static final int aXj = v.aT("ilst");
  public static final int aXk = v.aT("mean");
  public static final int aXl = v.aT("name");
  public static final int aXm = v.aT("data");
  public static final int aXn = v.aT("emsg");
  public static final int aXo = v.aT("st3d");
  public static final int aXp = v.aT("sv3d");
  public static final int aXq = v.aT("proj");
  public static final int aXr = v.aT("vp08");
  public static final int aXs = v.aT("vp09");
  public static final int aXt = v.aT("vpcC");
  public static final int aXu = v.aT("camm");
  public static final int aXv = v.aT("alac");
  public final int type;

  public a(int paramInt)
  {
    this.type = paramInt;
  }

  public static int dT(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }

  public static int dU(int paramInt)
  {
    return 0xFFFFFF & paramInt;
  }

  public static String dV(int paramInt)
  {
    return (char)(paramInt >> 24 & 0xFF) + (char)(paramInt >> 16 & 0xFF) + (char)(paramInt >> 8 & 0xFF) + (char)(paramInt & 0xFF);
  }

  public String toString()
  {
    return dV(this.type);
  }

  static final class a extends a
  {
    public final long aXw;
    public final List<a.b> aXx;
    public final List<a> aXy;

    public a(int paramInt, long paramLong)
    {
      super();
      AppMethodBeat.i(94935);
      this.aXw = paramLong;
      this.aXx = new ArrayList();
      this.aXy = new ArrayList();
      AppMethodBeat.o(94935);
    }

    public final void a(a parama)
    {
      AppMethodBeat.i(94937);
      this.aXy.add(parama);
      AppMethodBeat.o(94937);
    }

    public final void a(a.b paramb)
    {
      AppMethodBeat.i(94936);
      this.aXx.add(paramb);
      AppMethodBeat.o(94936);
    }

    public final a.b dW(int paramInt)
    {
      AppMethodBeat.i(94938);
      int i = this.aXx.size();
      int j = 0;
      a.b localb;
      if (j < i)
      {
        localb = (a.b)this.aXx.get(j);
        if (localb.type == paramInt)
          AppMethodBeat.o(94938);
      }
      while (true)
      {
        return localb;
        j++;
        break;
        localb = null;
        AppMethodBeat.o(94938);
      }
    }

    public final a dX(int paramInt)
    {
      AppMethodBeat.i(94939);
      int i = this.aXy.size();
      int j = 0;
      a locala;
      if (j < i)
      {
        locala = (a)this.aXy.get(j);
        if (locala.type == paramInt)
          AppMethodBeat.o(94939);
      }
      while (true)
      {
        return locala;
        j++;
        break;
        locala = null;
        AppMethodBeat.o(94939);
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(94940);
      String str = dV(this.type) + " leaves: " + Arrays.toString(this.aXx.toArray()) + " containers: " + Arrays.toString(this.aXy.toArray());
      AppMethodBeat.o(94940);
      return str;
    }
  }

  static final class b extends a
  {
    public final l aXz;

    public b(int paramInt, l paraml)
    {
      super();
      this.aXz = paraml;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.a
 * JD-Core Version:    0.6.2
 */