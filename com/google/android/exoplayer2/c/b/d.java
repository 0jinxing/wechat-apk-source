package com.google.android.exoplayer2.c.b;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.c.m.a;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.google.android.exoplayer2.video.ColorInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class d
  implements com.google.android.exoplayer2.c.e
{
  private static final byte[] aTI;
  private static final byte[] aTJ;
  private static long aTK;
  static final byte[] aTL;
  private static final byte[] aTM;
  private static long aTN;
  private static final byte[] aTO;
  private static final UUID aTP;
  public static final h aTh;
  long aOz;
  final f aTC;
  private final b aTQ;
  final SparseArray<d.b> aTR;
  final boolean aTS;
  private final com.google.android.exoplayer2.i.l aTT;
  final com.google.android.exoplayer2.i.l aTU;
  private final com.google.android.exoplayer2.i.l aTV;
  private final com.google.android.exoplayer2.i.l aTW;
  private final com.google.android.exoplayer2.i.l aTX;
  private final com.google.android.exoplayer2.i.l aTY;
  private ByteBuffer aTZ;
  final com.google.android.exoplayer2.i.l aTj;
  com.google.android.exoplayer2.c.g aTn;
  private final com.google.android.exoplayer2.i.l aTx;
  private final com.google.android.exoplayer2.i.l aTy;
  private boolean aUA;
  private boolean aUB;
  private boolean aUC;
  private byte aUD;
  private int aUE;
  private int aUF;
  private int aUG;
  private boolean aUH;
  boolean aUI;
  long aUa;
  long aUb;
  long aUc;
  long aUd;
  d.b aUe;
  boolean aUf;
  int aUg;
  long aUh;
  boolean aUi;
  long aUj;
  private long aUk;
  long aUl;
  com.google.android.exoplayer2.i.g aUm;
  com.google.android.exoplayer2.i.g aUn;
  boolean aUo;
  int aUp;
  long aUq;
  long aUr;
  int aUs;
  int aUt;
  int[] aUu;
  int aUv;
  int aUw;
  int aUx;
  private int aUy;
  private boolean aUz;

  static
  {
    AppMethodBeat.i(94914);
    aTh = new d.1();
    aTI = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
    aTJ = new byte[] { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    aTK = 1000L;
    aTL = v.aQ("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    aTM = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
    aTN = 10000L;
    aTO = new byte[] { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    aTP = new UUID(72057594037932032L, -9223371306706625679L);
    AppMethodBeat.o(94914);
  }

  public d()
  {
    this(0);
  }

  public d(int paramInt)
  {
    this(new a(), paramInt);
    AppMethodBeat.i(94899);
    AppMethodBeat.o(94899);
  }

  private d(b paramb, int paramInt)
  {
    AppMethodBeat.i(94900);
    this.aUb = -1L;
    this.aUc = -9223372036854775807L;
    this.aUd = -9223372036854775807L;
    this.aOz = -9223372036854775807L;
    this.aUj = -1L;
    this.aUk = -1L;
    this.aUl = -9223372036854775807L;
    this.aTQ = paramb;
    this.aTQ.a(new a((byte)0));
    if ((paramInt & 0x1) == 0)
      bool = true;
    this.aTS = bool;
    this.aTC = new f();
    this.aTR = new SparseArray();
    this.aTj = new com.google.android.exoplayer2.i.l(4);
    this.aTT = new com.google.android.exoplayer2.i.l(ByteBuffer.allocate(4).putInt(-1).array());
    this.aTU = new com.google.android.exoplayer2.i.l(4);
    this.aTx = new com.google.android.exoplayer2.i.l(j.bqY);
    this.aTy = new com.google.android.exoplayer2.i.l(4);
    this.aTV = new com.google.android.exoplayer2.i.l();
    this.aTW = new com.google.android.exoplayer2.i.l();
    this.aTX = new com.google.android.exoplayer2.i.l(8);
    this.aTY = new com.google.android.exoplayer2.i.l();
    AppMethodBeat.o(94900);
  }

  private int a(com.google.android.exoplayer2.c.f paramf, m paramm, int paramInt)
  {
    AppMethodBeat.i(94911);
    int i = this.aTV.tB();
    if (i > 0)
    {
      paramInt = Math.min(paramInt, i);
      paramm.a(this.aTV, paramInt);
    }
    while (true)
    {
      this.aUy += paramInt;
      this.aUG += paramInt;
      AppMethodBeat.o(94911);
      return paramInt;
      paramInt = paramm.a(paramf, paramInt, false);
    }
  }

  private void a(d.b paramb, String paramString, int paramInt, long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94909);
    a(this.aTW.data, this.aUr, paramString, paramInt, paramLong, paramArrayOfByte);
    paramb.aTw.a(this.aTW, this.aTW.limit);
    this.aUG += this.aTW.limit;
    AppMethodBeat.o(94909);
  }

  private void a(com.google.android.exoplayer2.c.f paramf, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(94908);
    int i = paramArrayOfByte.length + paramInt;
    if (this.aTW.capacity() < i)
      this.aTW.data = Arrays.copyOf(paramArrayOfByte, i + paramInt);
    while (true)
    {
      paramf.readFully(this.aTW.data, paramArrayOfByte.length, paramInt);
      this.aTW.reset(i);
      AppMethodBeat.o(94908);
      return;
      System.arraycopy(paramArrayOfByte, 0, this.aTW.data, 0, paramArrayOfByte.length);
    }
  }

  private static void a(byte[] paramArrayOfByte1, long paramLong1, String paramString, int paramInt, long paramLong2, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(94910);
    if (paramLong1 == -9223372036854775807L);
    int i;
    int j;
    int k;
    int m;
    for (paramString = paramArrayOfByte2; ; paramString = v.aQ(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) })))
    {
      System.arraycopy(paramString, 0, paramArrayOfByte1, paramInt, paramArrayOfByte2.length);
      AppMethodBeat.o(94910);
      return;
      i = (int)(paramLong1 / 3600000000L);
      paramLong1 -= i * 3600 * 1000000L;
      j = (int)(paramLong1 / 60000000L);
      paramLong1 -= j * 60 * 1000000L;
      k = (int)(paramLong1 / 1000000L);
      m = (int)((paramLong1 - k * 1000000L) / paramLong2);
    }
  }

  static int[] d(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(94913);
    if (paramArrayOfInt == null)
    {
      paramArrayOfInt = new int[paramInt];
      AppMethodBeat.o(94913);
    }
    while (true)
    {
      return paramArrayOfInt;
      if (paramArrayOfInt.length >= paramInt)
      {
        AppMethodBeat.o(94913);
      }
      else
      {
        paramArrayOfInt = new int[Math.max(paramArrayOfInt.length * 2, paramInt)];
        AppMethodBeat.o(94913);
      }
    }
  }

  static int dO(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 160:
    case 174:
    case 183:
    case 187:
    case 224:
    case 225:
    case 18407:
    case 19899:
    case 20532:
    case 20533:
    case 21936:
    case 21968:
    case 25152:
    case 28032:
    case 30320:
    case 290298740:
    case 357149030:
    case 374648427:
    case 408125543:
    case 440786851:
    case 475249515:
    case 524531317:
    case 131:
    case 136:
    case 155:
    case 159:
    case 176:
    case 179:
    case 186:
    case 215:
    case 231:
    case 241:
    case 251:
    case 16980:
    case 17029:
    case 17143:
    case 18401:
    case 18408:
    case 20529:
    case 20530:
    case 21420:
    case 21432:
    case 21680:
    case 21682:
    case 21690:
    case 21930:
    case 21945:
    case 21946:
    case 21947:
    case 21948:
    case 21949:
    case 22186:
    case 22203:
    case 25188:
    case 2352003:
    case 2807729:
    case 134:
    case 17026:
    case 2274716:
    case 161:
    case 163:
    case 16981:
    case 18402:
    case 21419:
    case 25506:
    case 30322:
    case 181:
    case 17545:
    case 21969:
    case 21970:
    case 21971:
    case 21972:
    case 21973:
    case 21974:
    case 21975:
    case 21976:
    case 21977:
    case 21978:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
      continue;
      paramInt = 5;
    }
  }

  static boolean dP(int paramInt)
  {
    if ((paramInt == 357149030) || (paramInt == 524531317) || (paramInt == 475249515) || (paramInt == 374648427));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void rd()
  {
    AppMethodBeat.i(94905);
    this.aUy = 0;
    this.aUG = 0;
    this.aUF = 0;
    this.aUz = false;
    this.aUA = false;
    this.aUC = false;
    this.aUE = 0;
    this.aUD = ((byte)0);
    this.aUB = false;
    this.aTV.reset();
    AppMethodBeat.o(94905);
  }

  final long N(long paramLong)
  {
    AppMethodBeat.i(94912);
    if (this.aUc == -9223372036854775807L)
    {
      o localo = new o("Can't scale timecode prior to timecodeScale being set.");
      AppMethodBeat.o(94912);
      throw localo;
    }
    paramLong = v.b(paramLong, this.aUc, 1000L);
    AppMethodBeat.o(94912);
    return paramLong;
  }

  public final int a(com.google.android.exoplayer2.c.f paramf, k paramk)
  {
    int i = 1;
    AppMethodBeat.i(94903);
    this.aUH = false;
    boolean bool = true;
    label173: 
    while (true)
    {
      int j;
      if ((bool) && (!this.aUH))
      {
        bool = this.aTQ.c(paramf);
        if (!bool)
          break label173;
        long l = paramf.getPosition();
        if (this.aUi)
        {
          this.aUk = l;
          paramk.position = this.aUj;
          this.aUi = false;
          j = 1;
          if (j == 0)
            break label173;
          AppMethodBeat.o(94903);
          j = i;
        }
      }
      while (true)
      {
        return j;
        if ((this.aUf) && (this.aUk != -1L))
        {
          paramk.position = this.aUk;
          this.aUk = -1L;
          j = 1;
          break;
        }
        j = 0;
        break;
        if (bool)
        {
          AppMethodBeat.o(94903);
          j = 0;
        }
        else
        {
          j = -1;
          AppMethodBeat.o(94903);
        }
      }
    }
  }

  final void a(d.b paramb, long paramLong)
  {
    AppMethodBeat.i(94904);
    if ("S_TEXT/UTF8".equals(paramb.aUK))
      a(paramb, "%02d:%02d:%02d,%03d", 19, aTK, aTJ);
    while (true)
    {
      paramb.aTw.a(paramLong, this.aUx, this.aUG, 0, paramb.aUO);
      this.aUH = true;
      rd();
      AppMethodBeat.o(94904);
      return;
      if ("S_TEXT/ASS".equals(paramb.aUK))
        a(paramb, "%01d:%02d:%02d:%02d", 21, aTN, aTO);
    }
  }

  final void a(com.google.android.exoplayer2.c.f paramf, d.b paramb, int paramInt)
  {
    AppMethodBeat.i(94907);
    if ("S_TEXT/UTF8".equals(paramb.aUK))
    {
      a(paramf, aTI, paramInt);
      AppMethodBeat.o(94907);
    }
    while (true)
    {
      return;
      if ("S_TEXT/ASS".equals(paramb.aUK))
      {
        a(paramf, aTM, paramInt);
        AppMethodBeat.o(94907);
      }
      else
      {
        m localm = paramb.aTw;
        int i;
        label218: byte[] arrayOfByte;
        int j;
        label288: int m;
        if (!this.aUz)
        {
          if (!paramb.aUM)
            break label925;
          this.aUx &= -1073741825;
          if (!this.aUA)
          {
            paramf.readFully(this.aTj.data, 0, 1);
            this.aUy += 1;
            if ((this.aTj.data[0] & 0x80) == 128)
            {
              paramf = new o("Extension bit is set in signal byte");
              AppMethodBeat.o(94907);
              throw paramf;
            }
            this.aUD = ((byte)this.aTj.data[0]);
            this.aUA = true;
          }
          int k;
          if ((this.aUD & 0x1) == 1)
          {
            i = 1;
            if (i == 0)
              break label693;
            if ((this.aUD & 0x2) != 2)
              break label594;
            i = 1;
            this.aUx |= 1073741824;
            if (!this.aUB)
            {
              paramf.readFully(this.aTX.data, 0, 8);
              this.aUy += 8;
              this.aUB = true;
              arrayOfByte = this.aTj.data;
              if (i == 0)
                break label600;
              j = 128;
              arrayOfByte[0] = ((byte)(byte)(j | 0x8));
              this.aTj.setPosition(0);
              localm.a(this.aTj, 1);
              this.aUG += 1;
              this.aTX.setPosition(0);
              localm.a(this.aTX, 8);
              this.aUG += 8;
            }
            if (i == 0)
              break label693;
            if (!this.aUC)
            {
              paramf.readFully(this.aTj.data, 0, 1);
              this.aUy += 1;
              this.aTj.setPosition(0);
              this.aUE = this.aTj.readUnsignedByte();
              this.aUC = true;
            }
            i = this.aUE * 4;
            this.aTj.reset(i);
            paramf.readFully(this.aTj.data, 0, i);
            this.aUy = (i + this.aUy);
            short s = (short)(this.aUE / 2 + 1);
            k = s * 6 + 2;
            if ((this.aTZ == null) || (this.aTZ.capacity() < k))
              this.aTZ = ByteBuffer.allocate(k);
            this.aTZ.position(0);
            this.aTZ.putShort(s);
            i = 0;
            j = 0;
            label539: if (j >= this.aUE)
              break label622;
            m = this.aTj.tI();
            if (j % 2 != 0)
              break label606;
            this.aTZ.putShort((short)(m - i));
          }
          while (true)
          {
            j++;
            i = m;
            break label539;
            i = 0;
            break;
            label594: i = 0;
            break label218;
            label600: j = 0;
            break label288;
            label606: this.aTZ.putInt(m - i);
          }
          label622: i = paramInt - this.aUy - i;
          if (this.aUE % 2 == 1)
          {
            this.aTZ.putInt(i);
            this.aTY.n(this.aTZ.array(), k);
            localm.a(this.aTY, k);
            this.aUG += k;
            label693: this.aUz = true;
          }
        }
        else
        {
          j = this.aTV.limit + paramInt;
          if ((!"V_MPEG4/ISO/AVC".equals(paramb.aUK)) && (!"V_MPEGH/ISO/HEVC".equals(paramb.aUK)))
            break label974;
          arrayOfByte = this.aTy.data;
          arrayOfByte[0] = ((byte)0);
          arrayOfByte[1] = ((byte)0);
          arrayOfByte[2] = ((byte)0);
          m = paramb.aTz;
          paramInt = 4 - paramb.aTz;
        }
        while (true)
          if (this.aUy < j)
          {
            if (this.aUF == 0)
            {
              i = Math.min(m, this.aTV.tB());
              paramf.readFully(arrayOfByte, paramInt + i, m - i);
              if (i > 0)
                this.aTV.readBytes(arrayOfByte, paramInt, i);
              this.aUy += m;
              this.aTy.setPosition(0);
              this.aUF = this.aTy.tI();
              this.aTx.setPosition(0);
              localm.a(this.aTx, 4);
              this.aUG += 4;
              continue;
              this.aTZ.putShort((short)i);
              this.aTZ.putInt(0);
              break;
              label925: if (paramb.aUN == null)
                break label693;
              this.aTV.n(paramb.aUN, paramb.aUN.length);
              break label693;
            }
            this.aUF -= a(paramf, localm, this.aUF);
            continue;
            label974: 
            while (this.aUy < j)
              a(paramf, localm, j - this.aUy);
          }
        if ("A_VORBIS".equals(paramb.aUK))
        {
          this.aTT.setPosition(0);
          localm.a(this.aTT, 4);
          this.aUG += 4;
        }
        AppMethodBeat.o(94907);
      }
    }
  }

  public final void a(com.google.android.exoplayer2.c.g paramg)
  {
    this.aTn = paramg;
  }

  public final boolean a(com.google.android.exoplayer2.c.f paramf)
  {
    AppMethodBeat.i(94901);
    e locale = new e();
    long l1 = paramf.getLength();
    if ((l1 == -1L) || (l1 > 1024L));
    for (long l2 = 1024L; ; l2 = l1)
    {
      int i = (int)l2;
      paramf.b(locale.aTj.data, 0, 4);
      l2 = locale.aTj.cM();
      locale.aVo = 4;
      while (l2 != 440786851L)
      {
        int j = locale.aVo + 1;
        locale.aVo = j;
        if (j == i)
          break label319;
        paramf.b(locale.aTj.data, 0, 1);
        l2 = l2 << 8 & 0xFFFFFF00 | locale.aTj.data[0] & 0xFF;
      }
    }
    l2 = locale.d(paramf);
    long l3 = locale.aVo;
    boolean bool;
    if ((l2 == -9223372036854775808L) || ((l1 != -1L) && (l3 + l2 >= l1)))
    {
      bool = false;
      AppMethodBeat.o(94901);
    }
    while (true)
    {
      return bool;
      do
      {
        if (l1 != 0L)
        {
          paramf.dH((int)l1);
          locale.aVo = ((int)(l1 + locale.aVo));
        }
        if (locale.aVo >= l3 + l2)
          break;
        if (locale.d(paramf) == -9223372036854775808L)
          break label319;
        l1 = locale.d(paramf);
      }
      while ((l1 >= 0L) && (l1 <= 2147483647L));
      bool = false;
      AppMethodBeat.o(94901);
      continue;
      if (locale.aVo == l2 + l3)
      {
        bool = true;
        AppMethodBeat.o(94901);
      }
      else
      {
        label319: bool = false;
        AppMethodBeat.o(94901);
      }
    }
  }

  final void b(com.google.android.exoplayer2.c.f paramf, int paramInt)
  {
    AppMethodBeat.i(94906);
    if (this.aTj.limit >= paramInt)
      AppMethodBeat.o(94906);
    while (true)
    {
      return;
      if (this.aTj.capacity() < paramInt)
        this.aTj.n(Arrays.copyOf(this.aTj.data, Math.max(this.aTj.data.length * 2, paramInt)), this.aTj.limit);
      paramf.readFully(this.aTj.data, this.aTj.limit, paramInt - this.aTj.limit);
      this.aTj.eL(paramInt);
      AppMethodBeat.o(94906);
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94902);
    this.aUl = -9223372036854775807L;
    this.aUp = 0;
    this.aTQ.reset();
    this.aTC.reset();
    rd();
    AppMethodBeat.o(94902);
  }

  final class a
    implements c
  {
    private a()
    {
    }

    public final void a(int paramInt1, int paramInt2, com.google.android.exoplayer2.c.f paramf)
    {
      AppMethodBeat.i(94895);
      d locald = d.this;
      switch (paramInt1)
      {
      default:
        paramf = new o("Unexpected id: ".concat(String.valueOf(paramInt1)));
        AppMethodBeat.o(94895);
        throw paramf;
      case 21419:
        Arrays.fill(locald.aTU.data, (byte)0);
        paramf.readFully(locald.aTU.data, 4 - paramInt2, paramInt2);
        locald.aTU.setPosition(0);
        locald.aUg = ((int)locald.aTU.cM());
        AppMethodBeat.o(94895);
      case 25506:
      case 30322:
      case 16981:
      case 18402:
      case 161:
      case 163:
      }
      while (true)
      {
        return;
        locald.aUe.aUP = new byte[paramInt2];
        paramf.readFully(locald.aUe.aUP, 0, paramInt2);
        AppMethodBeat.o(94895);
        continue;
        locald.aUe.aOl = new byte[paramInt2];
        paramf.readFully(locald.aUe.aOl, 0, paramInt2);
        AppMethodBeat.o(94895);
        continue;
        locald.aUe.aUN = new byte[paramInt2];
        paramf.readFully(locald.aUe.aUN, 0, paramInt2);
        AppMethodBeat.o(94895);
        continue;
        Object localObject1 = new byte[paramInt2];
        paramf.readFully((byte[])localObject1, 0, paramInt2);
        locald.aUe.aUO = new m.a(1, (byte[])localObject1, 0, 0);
        AppMethodBeat.o(94895);
        continue;
        if (locald.aUp == 0)
        {
          locald.aUv = ((int)locald.aTC.a(paramf, false, true, 8));
          locald.aUw = locald.aTC.length;
          locald.aUr = -9223372036854775807L;
          locald.aUp = 1;
          locald.aTj.reset();
        }
        localObject1 = (d.b)locald.aTR.get(locald.aUv);
        if (localObject1 == null)
        {
          paramf.dG(paramInt2 - locald.aUw);
          locald.aUp = 0;
          AppMethodBeat.o(94895);
        }
        else
        {
          int i;
          if (locald.aUp == 1)
          {
            locald.b(paramf, 3);
            i = (locald.aTj.data[2] & 0x6) >> 1;
            if (i != 0)
              break label726;
            locald.aUt = 1;
            locald.aUu = d.d(locald.aUu, 1);
            locald.aUu[0] = (paramInt2 - locald.aUw - 3);
            i = locald.aTj.data[0];
            paramInt2 = locald.aTj.data[1];
            locald.aUq = (locald.aUl + locald.N(i << 8 | paramInt2 & 0xFF));
            if ((locald.aTj.data[2] & 0x8) != 8)
              break label1402;
            paramInt2 = 1;
            label568: if ((((d.b)localObject1).type != 2) && ((paramInt1 != 163) || ((locald.aTj.data[2] & 0x80) != 128)))
              break label1407;
            i = 1;
            label607: if (i == 0)
              break label1413;
            i = 1;
            label615: if (paramInt2 == 0)
              break label1419;
          }
          label1413: label1419: for (paramInt2 = -2147483648; ; paramInt2 = 0)
          {
            locald.aUx = (paramInt2 | i);
            locald.aUp = 2;
            locald.aUs = 0;
            if (paramInt1 != 163)
              break label1438;
            while (locald.aUs < locald.aUt)
            {
              locald.a(paramf, (d.b)localObject1, locald.aUu[locald.aUs]);
              locald.a((d.b)localObject1, locald.aUq + locald.aUs * ((d.b)localObject1).aUL / 1000);
              locald.aUs += 1;
            }
            label726: if (paramInt1 != 163)
            {
              paramf = new o("Lacing only supported in SimpleBlocks.");
              AppMethodBeat.o(94895);
              throw paramf;
            }
            locald.b(paramf, 4);
            locald.aUt = ((locald.aTj.data[3] & 0xFF) + 1);
            locald.aUu = d.d(locald.aUu, locald.aUt);
            if (i == 2)
            {
              paramInt2 = (paramInt2 - locald.aUw - 4) / locald.aUt;
              Arrays.fill(locald.aUu, 0, locald.aUt, paramInt2);
              break;
            }
            int j;
            int k;
            int m;
            int n;
            Object localObject2;
            if (i == 1)
            {
              j = 0;
              i = 4;
              for (k = 0; k < locald.aUt - 1; k++)
              {
                locald.aUu[k] = 0;
                m = i;
                do
                {
                  i = m + 1;
                  locald.b(paramf, i);
                  n = locald.aTj.data[(i - 1)] & 0xFF;
                  localObject2 = locald.aUu;
                  localObject2[k] += n;
                  m = i;
                }
                while (n == 255);
                j += locald.aUu[k];
              }
              locald.aUu[(locald.aUt - 1)] = (paramInt2 - locald.aUw - i - j);
              break;
            }
            if (i == 3)
            {
              j = 0;
              i = 4;
              k = 0;
              if (k < locald.aUt - 1)
              {
                locald.aUu[k] = 0;
                n = i + 1;
                locald.b(paramf, n);
                if (locald.aTj.data[(n - 1)] == 0)
                {
                  paramf = new o("No valid varint length mask found");
                  AppMethodBeat.o(94895);
                  throw paramf;
                }
                long l1 = 0L;
                long l2;
                for (m = 0; ; m++)
                {
                  i = n;
                  l2 = l1;
                  if (m < 8)
                  {
                    int i1 = 1 << 7 - m;
                    if ((locald.aTj.data[(n - 1)] & i1) == 0)
                      continue;
                    int i2 = n - 1;
                    n += m;
                    locald.b(paramf, n);
                    localObject2 = locald.aTj.data;
                    i = i2 + 1;
                    l1 = localObject2[i2] & 0xFF & (i1 ^ 0xFFFFFFFF);
                    while (i < n)
                    {
                      l1 = l1 << 8 | locald.aTj.data[i] & 0xFF;
                      i++;
                    }
                    i = n;
                    l2 = l1;
                    if (k > 0)
                    {
                      l2 = l1 - ((1L << m * 7 + 6) - 1L);
                      i = n;
                    }
                  }
                  if ((l2 >= -2147483648L) && (l2 <= 2147483647L))
                    break;
                  paramf = new o("EBML lacing sample size out of range.");
                  AppMethodBeat.o(94895);
                  throw paramf;
                }
                m = (int)l2;
                localObject2 = locald.aUu;
                if (k == 0);
                while (true)
                {
                  localObject2[k] = m;
                  j += locald.aUu[k];
                  k++;
                  break;
                  m += locald.aUu[(k - 1)];
                }
              }
              locald.aUu[(locald.aUt - 1)] = (paramInt2 - locald.aUw - i - j);
              break;
            }
            paramf = new o("Unexpected lacing value: ".concat(String.valueOf(i)));
            AppMethodBeat.o(94895);
            throw paramf;
            label1402: paramInt2 = 0;
            break label568;
            label1407: i = 0;
            break label607;
            i = 0;
            break label615;
          }
          locald.aUp = 0;
          AppMethodBeat.o(94895);
          continue;
          label1438: locald.a(paramf, (d.b)localObject1, locald.aUu[0]);
          AppMethodBeat.o(94895);
        }
      }
    }

    public final void c(int paramInt, double paramDouble)
    {
      d locald = d.this;
      switch (paramInt)
      {
      default:
      case 17545:
      case 181:
      case 21969:
      case 21970:
      case 21971:
      case 21972:
      case 21973:
      case 21974:
      case 21975:
      case 21976:
      case 21977:
      case 21978:
      }
      while (true)
      {
        return;
        locald.aUd = (()paramDouble);
        continue;
        locald.aUe.sampleRate = ((int)paramDouble);
        continue;
        locald.aUe.aUZ = ((float)paramDouble);
        continue;
        locald.aUe.aVa = ((float)paramDouble);
        continue;
        locald.aUe.aVb = ((float)paramDouble);
        continue;
        locald.aUe.aVc = ((float)paramDouble);
        continue;
        locald.aUe.aVd = ((float)paramDouble);
        continue;
        locald.aUe.aVe = ((float)paramDouble);
        continue;
        locald.aUe.aVf = ((float)paramDouble);
        continue;
        locald.aUe.aVg = ((float)paramDouble);
        continue;
        locald.aUe.aVh = ((float)paramDouble);
        continue;
        locald.aUe.aVi = ((float)paramDouble);
      }
    }

    public final void d(int paramInt, String paramString)
    {
      AppMethodBeat.i(94894);
      d locald = d.this;
      switch (paramInt)
      {
      default:
      case 17026:
      case 134:
      case 2274716:
      }
      while (true)
      {
        AppMethodBeat.o(94894);
        while (true)
        {
          return;
          if (("webm".equals(paramString)) || ("matroska".equals(paramString)))
            break;
          paramString = new o("DocType " + paramString + " not supported");
          AppMethodBeat.o(94894);
          throw paramString;
          locald.aUe.aUK = paramString;
          AppMethodBeat.o(94894);
        }
        locald.aUe.aOt = paramString;
      }
    }

    public final int dO(int paramInt)
    {
      AppMethodBeat.i(94889);
      paramInt = d.dO(paramInt);
      AppMethodBeat.o(94889);
      return paramInt;
    }

    public final boolean dP(int paramInt)
    {
      AppMethodBeat.i(94890);
      boolean bool = d.dP(paramInt);
      AppMethodBeat.o(94890);
      return bool;
    }

    public final void dQ(int paramInt)
    {
      AppMethodBeat.i(94892);
      d locald = d.this;
      switch (paramInt)
      {
      default:
      case 357149030:
      case 19899:
      case 475249515:
      case 160:
      case 25152:
      case 28032:
      case 174:
      case 374648427:
      }
      while (true)
      {
        AppMethodBeat.o(94892);
        Object localObject1;
        Object localObject2;
        int i;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        while (true)
        {
          return;
          if (locald.aUc == -9223372036854775807L)
            locald.aUc = 1000000L;
          if (locald.aUd == -9223372036854775807L)
            break;
          locald.aOz = locald.N(locald.aUd);
          AppMethodBeat.o(94892);
          continue;
          if ((locald.aUg == -1) || (locald.aUh == -1L))
          {
            localObject1 = new o("Mandatory element SeekID or SeekPosition not found");
            AppMethodBeat.o(94892);
            throw ((Throwable)localObject1);
          }
          if (locald.aUg != 475249515)
            break;
          locald.aUj = locald.aUh;
          AppMethodBeat.o(94892);
          continue;
          if (locald.aUf)
            break;
          localObject2 = locald.aTn;
          if ((locald.aUb == -1L) || (locald.aOz == -9223372036854775807L) || (locald.aUm == null) || (locald.aUm.size == 0) || (locald.aUn == null) || (locald.aUn.size != locald.aUm.size))
          {
            locald.aUm = null;
            locald.aUn = null;
          }
          for (localObject1 = new l.a(locald.aOz); ; localObject1 = new com.google.android.exoplayer2.c.a((int[])localObject3, (long[])localObject4, (long[])localObject1, (long[])localObject5))
          {
            ((com.google.android.exoplayer2.c.g)localObject2).a((com.google.android.exoplayer2.c.l)localObject1);
            locald.aUf = true;
            AppMethodBeat.o(94892);
            break;
            i = locald.aUm.size;
            localObject3 = new int[i];
            localObject4 = new long[i];
            localObject1 = new long[i];
            localObject5 = new long[i];
            for (paramInt = 0; paramInt < i; paramInt++)
            {
              localObject5[paramInt] = locald.aUm.get(paramInt);
              localObject4[paramInt] = (locald.aUb + locald.aUn.get(paramInt));
            }
            for (paramInt = 0; paramInt < i - 1; paramInt++)
            {
              localObject3[paramInt] = ((int)(localObject4[(paramInt + 1)] - localObject4[paramInt]));
              localObject1[paramInt] = (localObject5[(paramInt + 1)] - localObject5[paramInt]);
            }
            localObject3[(i - 1)] = ((int)(locald.aUb + locald.aUa - localObject4[(i - 1)]));
            localObject1[(i - 1)] = (locald.aOz - localObject5[(i - 1)]);
            locald.aUm = null;
            locald.aUn = null;
          }
          if (locald.aUp != 2)
            break;
          if (!locald.aUI)
            locald.aUx |= 1;
          locald.a((d.b)locald.aTR.get(locald.aUv), locald.aUq);
          locald.aUp = 0;
          AppMethodBeat.o(94892);
          continue;
          if (!locald.aUe.aUM)
            break;
          if (locald.aUe.aUO == null)
          {
            localObject1 = new o("Encrypted Track found but ContentEncKeyID was not found");
            AppMethodBeat.o(94892);
            throw ((Throwable)localObject1);
          }
          locald.aUe.aOg = new DrmInitData(new DrmInitData.SchemeData[] { new DrmInitData.SchemeData(com.google.android.exoplayer2.b.aMx, "video/webm", locald.aUe.aUO.aTc) });
          AppMethodBeat.o(94892);
        }
        if ((locald.aUe.aUM) && (locald.aUe.aUN != null))
        {
          localObject1 = new o("Combining encryption and compression is not supported");
          AppMethodBeat.o(94892);
          throw ((Throwable)localObject1);
          localObject1 = locald.aUe.aUK;
          label1014: int j;
          int k;
          if (("V_VP8".equals(localObject1)) || ("V_VP9".equals(localObject1)) || ("V_MPEG2".equals(localObject1)) || ("V_MPEG4/ISO/SP".equals(localObject1)) || ("V_MPEG4/ISO/ASP".equals(localObject1)) || ("V_MPEG4/ISO/AP".equals(localObject1)) || ("V_MPEG4/ISO/AVC".equals(localObject1)) || ("V_MPEGH/ISO/HEVC".equals(localObject1)) || ("V_MS/VFW/FOURCC".equals(localObject1)) || ("V_THEORA".equals(localObject1)) || ("A_OPUS".equals(localObject1)) || ("A_VORBIS".equals(localObject1)) || ("A_AAC".equals(localObject1)) || ("A_MPEG/L2".equals(localObject1)) || ("A_MPEG/L3".equals(localObject1)) || ("A_AC3".equals(localObject1)) || ("A_EAC3".equals(localObject1)) || ("A_TRUEHD".equals(localObject1)) || ("A_DTS".equals(localObject1)) || ("A_DTS/EXPRESS".equals(localObject1)) || ("A_DTS/LOSSLESS".equals(localObject1)) || ("A_FLAC".equals(localObject1)) || ("A_MS/ACM".equals(localObject1)) || ("A_PCM/INT/LIT".equals(localObject1)) || ("S_TEXT/UTF8".equals(localObject1)) || ("S_TEXT/ASS".equals(localObject1)) || ("S_VOBSUB".equals(localObject1)) || ("S_HDMV/PGS".equals(localObject1)) || ("S_DVBSUB".equals(localObject1)))
          {
            paramInt = 1;
            if (paramInt == 0)
              break label2051;
            localObject5 = locald.aUe;
            localObject3 = locald.aTn;
            j = locald.aUe.number;
            k = -1;
            i = -1;
            localObject4 = null;
            localObject1 = ((d.b)localObject5).aUK;
            paramInt = -1;
            switch (((String)localObject1).hashCode())
            {
            default:
            case 82338133:
            case 82338134:
            case 1809237540:
            case -2095575984:
            case -538363189:
            case -2095576542:
            case -538363109:
            case 855502857:
            case -1373388978:
            case 444813526:
            case -1730367663:
            case 1951062397:
            case 62923557:
            case -1482641358:
            case -1482641357:
            case 62923603:
            case 1950749482:
            case -1784763192:
            case 62927045:
            case 542569478:
            case -356037306:
            case 1950789798:
            case -1985379776:
            case 725957860:
            case 1422270023:
            case 738597099:
            case -425012669:
            case 99146302:
            case -933872740:
            }
          }
          while (true)
            switch (paramInt)
            {
            default:
              localObject1 = new o("Unrecognized codec identifier.");
              AppMethodBeat.o(94892);
              throw ((Throwable)localObject1);
              paramInt = 0;
              break label1014;
              if (((String)localObject1).equals("V_VP8"))
              {
                paramInt = 0;
                continue;
                if (((String)localObject1).equals("V_VP9"))
                {
                  paramInt = 1;
                  continue;
                  if (((String)localObject1).equals("V_MPEG2"))
                  {
                    paramInt = 2;
                    continue;
                    if (((String)localObject1).equals("V_MPEG4/ISO/SP"))
                    {
                      paramInt = 3;
                      continue;
                      if (((String)localObject1).equals("V_MPEG4/ISO/ASP"))
                      {
                        paramInt = 4;
                        continue;
                        if (((String)localObject1).equals("V_MPEG4/ISO/AP"))
                        {
                          paramInt = 5;
                          continue;
                          if (((String)localObject1).equals("V_MPEG4/ISO/AVC"))
                          {
                            paramInt = 6;
                            continue;
                            if (((String)localObject1).equals("V_MPEGH/ISO/HEVC"))
                            {
                              paramInt = 7;
                              continue;
                              if (((String)localObject1).equals("V_MS/VFW/FOURCC"))
                              {
                                paramInt = 8;
                                continue;
                                if (((String)localObject1).equals("V_THEORA"))
                                {
                                  paramInt = 9;
                                  continue;
                                  if (((String)localObject1).equals("A_VORBIS"))
                                  {
                                    paramInt = 10;
                                    continue;
                                    if (((String)localObject1).equals("A_OPUS"))
                                    {
                                      paramInt = 11;
                                      continue;
                                      if (((String)localObject1).equals("A_AAC"))
                                      {
                                        paramInt = 12;
                                        continue;
                                        if (((String)localObject1).equals("A_MPEG/L2"))
                                        {
                                          paramInt = 13;
                                          continue;
                                          if (((String)localObject1).equals("A_MPEG/L3"))
                                          {
                                            paramInt = 14;
                                            continue;
                                            if (((String)localObject1).equals("A_AC3"))
                                            {
                                              paramInt = 15;
                                              continue;
                                              if (((String)localObject1).equals("A_EAC3"))
                                              {
                                                paramInt = 16;
                                                continue;
                                                if (((String)localObject1).equals("A_TRUEHD"))
                                                {
                                                  paramInt = 17;
                                                  continue;
                                                  if (((String)localObject1).equals("A_DTS"))
                                                  {
                                                    paramInt = 18;
                                                    continue;
                                                    if (((String)localObject1).equals("A_DTS/EXPRESS"))
                                                    {
                                                      paramInt = 19;
                                                      continue;
                                                      if (((String)localObject1).equals("A_DTS/LOSSLESS"))
                                                      {
                                                        paramInt = 20;
                                                        continue;
                                                        if (((String)localObject1).equals("A_FLAC"))
                                                        {
                                                          paramInt = 21;
                                                          continue;
                                                          if (((String)localObject1).equals("A_MS/ACM"))
                                                          {
                                                            paramInt = 22;
                                                            continue;
                                                            if (((String)localObject1).equals("A_PCM/INT/LIT"))
                                                            {
                                                              paramInt = 23;
                                                              continue;
                                                              if (((String)localObject1).equals("S_TEXT/UTF8"))
                                                              {
                                                                paramInt = 24;
                                                                continue;
                                                                if (((String)localObject1).equals("S_TEXT/ASS"))
                                                                {
                                                                  paramInt = 25;
                                                                  continue;
                                                                  if (((String)localObject1).equals("S_VOBSUB"))
                                                                  {
                                                                    paramInt = 26;
                                                                    continue;
                                                                    if (((String)localObject1).equals("S_HDMV/PGS"))
                                                                    {
                                                                      paramInt = 27;
                                                                      continue;
                                                                      if (((String)localObject1).equals("S_DVBSUB"))
                                                                        paramInt = 28;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            }
          localObject1 = "video/x-vnd.on2.vp8";
          localObject2 = localObject4;
          paramInt = k;
          label1929: label1940: int m;
          if (((d.b)localObject5).aVn)
          {
            k = 1;
            if (!((d.b)localObject5).aVm)
              break label2845;
            m = 2;
            label1951: k = k | 0x0 | m;
            if (!i.aH((String)localObject1))
              break label2851;
            localObject1 = Format.a(Integer.toString(j), (String)localObject1, -1, paramInt, ((d.b)localObject5).aOn, ((d.b)localObject5).sampleRate, i, (List)localObject2, ((d.b)localObject5).aOg, k, ((d.b)localObject5).aOt);
          }
          while (true)
          {
            ((d.b)localObject5).aTw = ((com.google.android.exoplayer2.c.g)localObject3).dM(((d.b)localObject5).number);
            ((d.b)localObject5).aTw.f((Format)localObject1);
            locald.aTR.put(locald.aUe.number, locald.aUe);
            label2051: locald.aUe = null;
            AppMethodBeat.o(94892);
            break;
            localObject1 = "video/x-vnd.on2.vp9";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "video/mpeg2";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject4 = "video/mp4v-es";
            if (((d.b)localObject5).aUP == null);
            for (localObject1 = null; ; localObject1 = Collections.singletonList(((d.b)localObject5).aUP))
            {
              localObject2 = localObject1;
              localObject1 = localObject4;
              paramInt = k;
              break;
            }
            localObject1 = "video/avc";
            localObject4 = com.google.android.exoplayer2.video.a.K(new com.google.android.exoplayer2.i.l(((d.b)localObject5).aUP));
            localObject2 = ((com.google.android.exoplayer2.video.a)localObject4).aOf;
            ((d.b)localObject5).aTz = ((com.google.android.exoplayer2.video.a)localObject4).aTz;
            paramInt = k;
            break label1929;
            localObject1 = "video/hevc";
            localObject4 = com.google.android.exoplayer2.video.b.M(new com.google.android.exoplayer2.i.l(((d.b)localObject5).aUP));
            localObject2 = ((com.google.android.exoplayer2.video.b)localObject4).aOf;
            ((d.b)localObject5).aTz = ((com.google.android.exoplayer2.video.b)localObject4).aTz;
            paramInt = k;
            break label1929;
            localObject2 = d.b.i(new com.google.android.exoplayer2.i.l(((d.b)localObject5).aUP));
            if (localObject2 != null)
            {
              localObject1 = "video/wvc1";
              paramInt = k;
              break label1929;
            }
            localObject1 = "video/x-unknown";
            paramInt = k;
            break label1929;
            localObject1 = "video/x-unknown";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/vorbis";
            paramInt = 8192;
            localObject2 = d.b.m(((d.b)localObject5).aUP);
            break label1929;
            localObject1 = "audio/opus";
            paramInt = 5760;
            localObject2 = new ArrayList(3);
            ((List)localObject2).add(((d.b)localObject5).aUP);
            ((List)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((d.b)localObject5).aVk).array());
            ((List)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((d.b)localObject5).aVl).array());
            break label1929;
            localObject1 = "audio/mp4a-latm";
            localObject2 = Collections.singletonList(((d.b)localObject5).aUP);
            paramInt = k;
            break label1929;
            localObject1 = "audio/mpeg-L2";
            paramInt = 4096;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/mpeg";
            paramInt = 4096;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/ac3";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/eac3";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/true-hd";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/vnd.dts";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/vnd.dts.hd";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/flac";
            localObject2 = Collections.singletonList(((d.b)localObject5).aUP);
            paramInt = k;
            break label1929;
            localObject1 = "audio/raw";
            if (d.b.j(new com.google.android.exoplayer2.i.l(((d.b)localObject5).aUP)))
            {
              m = v.eR(((d.b)localObject5).aVj);
              paramInt = k;
              i = m;
              localObject2 = localObject4;
              if (m != 0)
                break label1929;
              i = -1;
              localObject1 = "audio/x-unknown";
              new StringBuilder("Unsupported PCM bit depth: ").append(((d.b)localObject5).aVj).append(". Setting mimeType to ").append("audio/x-unknown");
              paramInt = k;
              localObject2 = localObject4;
              break label1929;
            }
            localObject1 = "audio/x-unknown";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "audio/raw";
            m = v.eR(((d.b)localObject5).aVj);
            paramInt = k;
            i = m;
            localObject2 = localObject4;
            if (m != 0)
              break label1929;
            i = -1;
            localObject1 = "audio/x-unknown";
            new StringBuilder("Unsupported PCM bit depth: ").append(((d.b)localObject5).aVj).append(". Setting mimeType to ").append("audio/x-unknown");
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "application/x-subrip";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "text/x-ssa";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "application/vobsub";
            localObject2 = Collections.singletonList(((d.b)localObject5).aUP);
            paramInt = k;
            break label1929;
            localObject1 = "application/pgs";
            paramInt = k;
            localObject2 = localObject4;
            break label1929;
            localObject1 = "application/dvbsubs";
            localObject2 = Collections.singletonList(new byte[] { localObject5.aUP[0], localObject5.aUP[1], localObject5.aUP[2], localObject5.aUP[3] });
            paramInt = k;
            break label1929;
            k = 0;
            break label1940;
            label2845: m = 0;
            break label1951;
            label2851: if (i.aI((String)localObject1))
            {
              label2882: label2905: float f2;
              if (((d.b)localObject5).aUS == 0)
              {
                if (((d.b)localObject5).aUQ == -1)
                {
                  i = ((d.b)localObject5).width;
                  ((d.b)localObject5).aUQ = i;
                  if (((d.b)localObject5).aUR != -1)
                    break label3186;
                  i = ((d.b)localObject5).height;
                  ((d.b)localObject5).aUR = i;
                }
              }
              else
              {
                float f1 = -1.0F;
                f2 = f1;
                if (((d.b)localObject5).aUQ != -1)
                {
                  f2 = f1;
                  if (((d.b)localObject5).aUR != -1)
                    f2 = ((d.b)localObject5).height * ((d.b)localObject5).aUQ / (((d.b)localObject5).width * ((d.b)localObject5).aUR);
                }
                localObject4 = null;
                if (((d.b)localObject5).aUT)
                {
                  if ((((d.b)localObject5).aUZ != -1.0F) && (((d.b)localObject5).aVa != -1.0F) && (((d.b)localObject5).aVb != -1.0F) && (((d.b)localObject5).aVc != -1.0F) && (((d.b)localObject5).aVd != -1.0F) && (((d.b)localObject5).aVe != -1.0F) && (((d.b)localObject5).aVf != -1.0F) && (((d.b)localObject5).aVg != -1.0F) && (((d.b)localObject5).aVh != -1.0F) && (((d.b)localObject5).aVi != -1.0F))
                    break label3196;
                  localObject4 = null;
                }
              }
              while (true)
              {
                localObject4 = new ColorInfo(((d.b)localObject5).aUU, ((d.b)localObject5).aUW, ((d.b)localObject5).aUV, (byte[])localObject4);
                localObject1 = Format.a(Integer.toString(j), (String)localObject1, paramInt, ((d.b)localObject5).width, ((d.b)localObject5).height, (List)localObject2, -1, f2, ((d.b)localObject5).aOl, ((d.b)localObject5).aOk, (ColorInfo)localObject4, ((d.b)localObject5).aOg);
                break;
                i = ((d.b)localObject5).aUQ;
                break label2882;
                label3186: i = ((d.b)localObject5).aUR;
                break label2905;
                label3196: localObject4 = new byte[25];
                ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])localObject4);
                localByteBuffer.put((byte)0);
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aUZ * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVa * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVb * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVc * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVd * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVe * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVf * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVg * 50000.0F + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVh + 0.5F));
                localByteBuffer.putShort((short)(int)(((d.b)localObject5).aVi + 0.5F));
                localByteBuffer.putShort((short)((d.b)localObject5).aUX);
                localByteBuffer.putShort((short)((d.b)localObject5).aUY);
              }
            }
            if ("application/x-subrip".equals(localObject1))
            {
              localObject1 = Format.a(Integer.toString(j), (String)localObject1, k, ((d.b)localObject5).aOt, ((d.b)localObject5).aOg);
            }
            else if ("text/x-ssa".equals(localObject1))
            {
              localObject2 = new ArrayList(2);
              ((List)localObject2).add(d.aTL);
              ((List)localObject2).add(((d.b)localObject5).aUP);
              localObject1 = Format.a(Integer.toString(j), (String)localObject1, k, ((d.b)localObject5).aOt, -1, ((d.b)localObject5).aOg, 9223372036854775807L, (List)localObject2);
            }
            else
            {
              if ((!"application/vobsub".equals(localObject1)) && (!"application/pgs".equals(localObject1)) && (!"application/dvbsubs".equals(localObject1)))
                break label3610;
              localObject1 = Format.a(Integer.toString(j), (String)localObject1, (List)localObject2, ((d.b)localObject5).aOt, ((d.b)localObject5).aOg);
            }
          }
          label3610: localObject1 = new o("Unexpected MIME type.");
          AppMethodBeat.o(94892);
          throw ((Throwable)localObject1);
          if (locald.aTR.size() == 0)
          {
            localObject1 = new o("No valid tracks were found");
            AppMethodBeat.o(94892);
            throw ((Throwable)localObject1);
          }
          locald.aTn.rb();
        }
      }
    }

    public final void f(int paramInt, long paramLong1, long paramLong2)
    {
      AppMethodBeat.i(94891);
      Object localObject = d.this;
      switch (paramInt)
      {
      default:
      case 408125543:
      case 19899:
      case 475249515:
      case 187:
      case 524531317:
      case 160:
      case 25152:
      case 20533:
      case 174:
      case 21968:
      }
      while (true)
      {
        AppMethodBeat.o(94891);
        while (true)
        {
          return;
          if ((((d)localObject).aUb != -1L) && (((d)localObject).aUb != paramLong1))
          {
            localObject = new o("Multiple Segment elements not supported");
            AppMethodBeat.o(94891);
            throw ((Throwable)localObject);
          }
          ((d)localObject).aUb = paramLong1;
          ((d)localObject).aUa = paramLong2;
          AppMethodBeat.o(94891);
          continue;
          ((d)localObject).aUg = -1;
          ((d)localObject).aUh = -1L;
          AppMethodBeat.o(94891);
          continue;
          ((d)localObject).aUm = new com.google.android.exoplayer2.i.g();
          ((d)localObject).aUn = new com.google.android.exoplayer2.i.g();
          AppMethodBeat.o(94891);
          continue;
          ((d)localObject).aUo = false;
          AppMethodBeat.o(94891);
          continue;
          if (((d)localObject).aUf)
            break;
          if ((((d)localObject).aTS) && (((d)localObject).aUj != -1L))
          {
            ((d)localObject).aUi = true;
            AppMethodBeat.o(94891);
          }
          else
          {
            ((d)localObject).aTn.a(new l.a(((d)localObject).aOz));
            ((d)localObject).aUf = true;
            AppMethodBeat.o(94891);
            continue;
            ((d)localObject).aUI = false;
            AppMethodBeat.o(94891);
            continue;
            AppMethodBeat.o(94891);
            continue;
            ((d)localObject).aUe.aUM = true;
            AppMethodBeat.o(94891);
            continue;
            ((d)localObject).aUe = new d.b((byte)0);
            AppMethodBeat.o(94891);
          }
        }
        ((d)localObject).aUe.aUT = true;
      }
    }

    public final void h(int paramInt, long paramLong)
    {
      boolean bool1 = true;
      boolean bool2 = true;
      AppMethodBeat.i(94893);
      Object localObject = d.this;
      switch (paramInt)
      {
      default:
      case 17143:
      case 17029:
      case 21420:
      case 2807729:
      case 176:
      case 186:
      case 21680:
      case 21690:
      case 21682:
      case 215:
      case 136:
      case 21930:
      case 131:
      case 2352003:
      case 22186:
      case 22203:
      case 159:
      case 25188:
      case 251:
      case 20529:
      case 20530:
      case 16980:
      case 18401:
      case 18408:
      case 179:
      case 241:
      case 231:
      case 155:
      case 21432:
      case 21947:
      case 21946:
      case 21945:
      case 21948:
      case 21949:
      }
      while (true)
      {
        AppMethodBeat.o(94893);
        while (true)
        {
          return;
          if (paramLong == 1L)
            break;
          localObject = new o("EBMLReadVersion " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          if ((paramLong >= 1L) && (paramLong <= 2L))
            break;
          localObject = new o("DocTypeReadVersion " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          ((d)localObject).aUh = (((d)localObject).aUb + paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUc = paramLong;
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.width = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.height = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aUQ = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aUR = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aUS = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.number = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          localObject = ((d)localObject).aUe;
          if (paramLong == 1L);
          while (true)
          {
            ((d.b)localObject).aVm = bool2;
            AppMethodBeat.o(94893);
            break;
            bool2 = false;
          }
          localObject = ((d)localObject).aUe;
          if (paramLong == 1L);
          for (bool2 = bool1; ; bool2 = false)
          {
            ((d.b)localObject).aVn = bool2;
            AppMethodBeat.o(94893);
            break;
          }
          ((d)localObject).aUe.type = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aUL = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aVk = paramLong;
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aVl = paramLong;
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aOn = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUe.aVj = ((int)paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUI = true;
          AppMethodBeat.o(94893);
          continue;
          if (paramLong == 0L)
            break;
          localObject = new o("ContentEncodingOrder " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          if (paramLong == 1L)
            break;
          localObject = new o("ContentEncodingScope " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          if (paramLong == 3L)
            break;
          localObject = new o("ContentCompAlgo " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          if (paramLong == 5L)
            break;
          localObject = new o("ContentEncAlgo " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          if (paramLong == 1L)
            break;
          localObject = new o("AESSettingsCipherMode " + paramLong + " not supported");
          AppMethodBeat.o(94893);
          throw ((Throwable)localObject);
          ((d)localObject).aUm.add(((d)localObject).N(paramLong));
          AppMethodBeat.o(94893);
          continue;
          if (((d)localObject).aUo)
            break;
          ((d)localObject).aUn.add(paramLong);
          ((d)localObject).aUo = true;
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUl = ((d)localObject).N(paramLong);
          AppMethodBeat.o(94893);
          continue;
          ((d)localObject).aUr = ((d)localObject).N(paramLong);
          AppMethodBeat.o(94893);
          continue;
          switch ((int)paramLong)
          {
          default:
            AppMethodBeat.o(94893);
            break;
          case 0:
            ((d)localObject).aUe.aOk = 0;
            AppMethodBeat.o(94893);
            break;
          case 1:
            ((d)localObject).aUe.aOk = 2;
            AppMethodBeat.o(94893);
            break;
          case 3:
            ((d)localObject).aUe.aOk = 1;
            AppMethodBeat.o(94893);
            break;
          case 15:
            ((d)localObject).aUe.aOk = 3;
            AppMethodBeat.o(94893);
            continue;
            ((d)localObject).aUe.aUT = true;
            switch ((int)paramLong)
            {
            case 2:
            case 3:
            case 8:
            default:
              AppMethodBeat.o(94893);
              break;
            case 1:
              ((d)localObject).aUe.aUU = 1;
              AppMethodBeat.o(94893);
              break;
            case 4:
            case 5:
            case 6:
            case 7:
              ((d)localObject).aUe.aUU = 2;
              AppMethodBeat.o(94893);
              break;
            case 9:
              ((d)localObject).aUe.aUU = 6;
              AppMethodBeat.o(94893);
              continue;
              switch ((int)paramLong)
              {
              default:
                AppMethodBeat.o(94893);
                break;
              case 1:
              case 6:
              case 7:
                ((d)localObject).aUe.aUV = 3;
                AppMethodBeat.o(94893);
                break;
              case 16:
                ((d)localObject).aUe.aUV = 6;
                AppMethodBeat.o(94893);
                break;
              case 18:
                ((d)localObject).aUe.aUV = 7;
                AppMethodBeat.o(94893);
                continue;
                switch ((int)paramLong)
                {
                default:
                  AppMethodBeat.o(94893);
                  break;
                case 1:
                  ((d)localObject).aUe.aUW = 2;
                  AppMethodBeat.o(94893);
                  break;
                case 2:
                  ((d)localObject).aUe.aUW = 1;
                  AppMethodBeat.o(94893);
                  continue;
                  ((d)localObject).aUe.aUX = ((int)paramLong);
                  AppMethodBeat.o(94893);
                }
                break;
              }
              break;
            }
            break;
          }
        }
        ((d)localObject).aUe.aUY = ((int)paramLong);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b.d
 * JD-Core Version:    0.6.2
 */