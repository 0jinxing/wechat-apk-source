package com.google.android.exoplayer2.f.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region.Op;
import android.util.SparseArray;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class b
{
  private static final byte[] bmB = { 0, 7, 8, 15 };
  private static final byte[] bmC = { 0, 119, -120, -1 };
  private static final byte[] bmD = { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
  private Bitmap bitmap;
  private final Paint bmE;
  private final Paint bmF;
  private final Canvas bmG;
  private final b.b bmH;
  private final b.a bmI;
  final b.h bmJ;

  public b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95626);
    this.bmE = new Paint();
    this.bmE.setStyle(Paint.Style.FILL_AND_STROKE);
    this.bmE.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    this.bmE.setPathEffect(null);
    this.bmF = new Paint();
    this.bmF.setStyle(Paint.Style.FILL);
    this.bmF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    this.bmF.setPathEffect(null);
    this.bmG = new Canvas();
    this.bmH = new b.b(719, 575, 0, 719, 0, 575);
    this.bmI = new b.a(0, sY(), sZ(), ta());
    this.bmJ = new b.h(paramInt1, paramInt2);
    AppMethodBeat.o(95626);
  }

  private static b.f a(k paramk, int paramInt)
  {
    AppMethodBeat.i(95628);
    int i = paramk.ed(8);
    paramk.ee(4);
    boolean bool = paramk.rl();
    paramk.ee(3);
    int j = paramk.ed(16);
    int k = paramk.ed(16);
    int m = paramk.ed(3);
    int n = paramk.ed(3);
    paramk.ee(2);
    int i1 = paramk.ed(8);
    int i2 = paramk.ed(8);
    int i3 = paramk.ed(4);
    int i4 = paramk.ed(2);
    paramk.ee(2);
    paramInt -= 10;
    SparseArray localSparseArray = new SparseArray();
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    if (paramInt > 0)
    {
      i5 = paramk.ed(16);
      i6 = paramk.ed(2);
      i7 = paramk.ed(2);
      i8 = paramk.ed(12);
      paramk.ee(4);
      i9 = paramk.ed(12);
      paramInt -= 6;
      i10 = 0;
      i11 = 0;
      if ((i6 != 1) && (i6 != 2))
        break label260;
      i10 = paramk.ed(8);
      i11 = paramk.ed(8);
      paramInt -= 2;
    }
    label260: 
    while (true)
    {
      localSparseArray.put(i5, new b.g(i6, i7, i8, i9, i10, i11));
      break;
      paramk = new b.f(i, bool, j, k, m, n, i1, i2, i3, i4, localSparseArray);
      AppMethodBeat.o(95628);
      return paramk;
    }
  }

  private static void a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    AppMethodBeat.i(95633);
    k localk = new k(paramArrayOfByte);
    paramArrayOfByte = null;
    byte[] arrayOfByte1 = null;
    int i = paramInt2;
    int j = paramInt3;
    paramInt3 = i;
    label112: byte[] arrayOfByte2;
    label129: int k;
    while (true)
      if (localk.tx() != 0)
        switch (localk.ed(8))
        {
        default:
          break;
        case 16:
          if (paramInt1 == 3)
            if (paramArrayOfByte == null)
            {
              arrayOfByte2 = bmC;
              i = 0;
              k = paramInt3;
            }
          break;
        case 17:
        case 18:
        case 32:
        case 33:
        case 34:
        case 240:
        }
    for (paramInt3 = i; ; paramInt3 = i)
    {
      int m = localk.ed(2);
      int n;
      if (m != 0)
      {
        n = 1;
        i = paramInt3;
        paramInt3 = m;
      }
      while (true)
      {
        if ((n != 0) && (paramPaint != null))
        {
          m = paramInt3;
          if (arrayOfByte2 != null)
            m = arrayOfByte2[paramInt3];
          paramPaint.setColor(paramArrayOfInt[m]);
          paramCanvas.drawRect(k, j, k + n, j + 1, paramPaint);
        }
        paramInt3 = k + n;
        if (i == 0)
          break label1097;
        localk.tA();
        break;
        arrayOfByte2 = paramArrayOfByte;
        break label129;
        if (paramInt1 == 2)
        {
          if (arrayOfByte1 == null);
          for (arrayOfByte2 = bmB; ; arrayOfByte2 = arrayOfByte1)
            break;
        }
        arrayOfByte2 = null;
        break label129;
        if (localk.rl())
        {
          i = localk.ed(3);
          m = localk.ed(2);
          n = i + 3;
          i = paramInt3;
          paramInt3 = m;
        }
        else if (localk.rl())
        {
          m = 0;
          n = 1;
          i = paramInt3;
          paramInt3 = m;
        }
        else
        {
          switch (localk.ed(2))
          {
          default:
            m = 0;
            n = 0;
            i = paramInt3;
            paramInt3 = m;
            break;
          case 0:
            paramInt3 = 0;
            n = 0;
            i = 1;
            break;
          case 1:
            m = 0;
            n = 2;
            i = paramInt3;
            paramInt3 = m;
            break;
          case 2:
            i = localk.ed(4);
            m = localk.ed(2);
            n = i + 12;
            i = paramInt3;
            paramInt3 = m;
            break;
          case 3:
            i = localk.ed(8);
            m = localk.ed(2);
            n = i + 29;
            i = paramInt3;
            paramInt3 = m;
          }
        }
      }
      if (paramInt1 == 3)
      {
        arrayOfByte2 = bmD;
        label509: i = 0;
        k = paramInt3;
      }
      for (paramInt3 = i; ; paramInt3 = i)
      {
        m = localk.ed(4);
        if (m != 0)
        {
          n = 1;
          i = paramInt3;
          paramInt3 = m;
        }
        while (true)
        {
          if ((n != 0) && (paramPaint != null))
          {
            m = paramInt3;
            if (arrayOfByte2 != null)
              m = arrayOfByte2[paramInt3];
            paramPaint.setColor(paramArrayOfInt[m]);
            paramCanvas.drawRect(k, j, k + n, j + 1, paramPaint);
          }
          paramInt3 = k + n;
          if (i == 0)
            break label1086;
          localk.tA();
          break;
          arrayOfByte2 = null;
          break label509;
          if (!localk.rl())
          {
            i = localk.ed(3);
            if (i != 0)
            {
              m = 0;
              n = i + 2;
              i = paramInt3;
              paramInt3 = m;
            }
            else
            {
              paramInt3 = 0;
              n = 0;
              i = 1;
            }
          }
          else if (!localk.rl())
          {
            i = localk.ed(2);
            m = localk.ed(4);
            n = i + 4;
            i = paramInt3;
            paramInt3 = m;
          }
          else
          {
            switch (localk.ed(2))
            {
            default:
              m = 0;
              n = 0;
              i = paramInt3;
              paramInt3 = m;
              break;
            case 0:
              m = 0;
              n = 1;
              i = paramInt3;
              paramInt3 = m;
              break;
            case 1:
              m = 0;
              n = 2;
              i = paramInt3;
              paramInt3 = m;
              break;
            case 2:
              i = localk.ed(4);
              m = localk.ed(4);
              n = i + 9;
              i = paramInt3;
              paramInt3 = m;
              break;
            case 3:
              i = localk.ed(8);
              m = localk.ed(4);
              n = i + 25;
              i = paramInt3;
              paramInt3 = m;
            }
          }
        }
        i = 0;
        k = paramInt3;
        paramInt3 = i;
        label1083: 
        while (true)
        {
          i = localk.ed(8);
          if (i != 0)
            n = 1;
          while (true)
          {
            if ((n != 0) && (paramPaint != null))
            {
              paramPaint.setColor(paramArrayOfInt[i]);
              paramCanvas.drawRect(k, j, k + n, j + 1, paramPaint);
            }
            k += n;
            if (paramInt3 == 0)
              break label1083;
            paramInt3 = k;
            break;
            if (!localk.rl())
            {
              n = localk.ed(7);
              if (n != 0)
              {
                i = 0;
              }
              else
              {
                i = 0;
                n = 0;
                paramInt3 = 1;
              }
            }
            else
            {
              n = localk.ed(7);
              i = localk.ed(8);
            }
          }
          arrayOfByte1 = a(4, 4, localk);
          break;
          paramArrayOfByte = a(4, 8, localk);
          break;
          paramArrayOfByte = a(16, 8, localk);
          break;
          j += 2;
          paramInt3 = paramInt2;
          break label112;
          AppMethodBeat.o(95633);
          return;
        }
        label1086: k = paramInt3;
      }
      label1097: k = paramInt3;
    }
  }

  private static byte[] a(int paramInt1, int paramInt2, k paramk)
  {
    AppMethodBeat.i(95634);
    byte[] arrayOfByte = new byte[paramInt1];
    for (int i = 0; i < paramInt1; i++)
      arrayOfByte[i] = ((byte)(byte)paramk.ed(paramInt2));
    AppMethodBeat.o(95634);
    return arrayOfByte;
  }

  private static b.a b(k paramk, int paramInt)
  {
    AppMethodBeat.i(95629);
    int i = paramk.ed(8);
    paramk.ee(8);
    paramInt -= 2;
    int[] arrayOfInt1 = sY();
    int[] arrayOfInt2 = sZ();
    int[] arrayOfInt3 = ta();
    if (paramInt > 0)
    {
      int j = paramk.ed(8);
      int k = paramk.ed(8);
      paramInt -= 2;
      int[] arrayOfInt4;
      label70: int m;
      int n;
      int i1;
      if ((k & 0x80) != 0)
      {
        arrayOfInt4 = arrayOfInt1;
        if ((k & 0x1) == 0)
          break label269;
        m = paramk.ed(8);
        k = paramk.ed(8);
        n = paramk.ed(8);
        i1 = paramk.ed(8);
        paramInt -= 4;
      }
      while (true)
      {
        if (m == 0)
        {
          k = 0;
          n = 0;
          i1 = 255;
        }
        i1 = (byte)(255 - (i1 & 0xFF));
        int i2 = (int)(m + 1.402D * (k - 128));
        k = (int)(m - 0.34414D * (n - 128) - 0.71414D * (k - 128));
        n = (int)(m + 1.772D * (n - 128));
        arrayOfInt4[j] = n(i1, v.u(i2, 0, 255), v.u(k, 0, 255), v.u(n, 0, 255));
        break;
        if ((k & 0x40) != 0)
        {
          arrayOfInt4 = arrayOfInt2;
          break label70;
        }
        arrayOfInt4 = arrayOfInt3;
        break label70;
        label269: m = paramk.ed(6) << 2;
        k = paramk.ed(4) << 4;
        n = paramk.ed(4) << 4;
        i1 = paramk.ed(2) << 6;
        paramInt -= 2;
      }
    }
    paramk = new b.a(i, arrayOfInt1, arrayOfInt2, arrayOfInt3);
    AppMethodBeat.o(95629);
    return paramk;
  }

  private static b.c b(k paramk)
  {
    byte[] arrayOfByte1 = null;
    AppMethodBeat.i(95630);
    int i = paramk.ed(16);
    paramk.ee(4);
    int j = paramk.ed(2);
    boolean bool = paramk.rl();
    paramk.ee(1);
    if (j == 1)
    {
      paramk.ee(paramk.ed(8) * 16);
      paramk = null;
      arrayOfByte1 = null;
    }
    while (true)
    {
      paramk = new b.c(i, bool, arrayOfByte1, paramk);
      AppMethodBeat.o(95630);
      return paramk;
      if (j == 0)
      {
        j = paramk.ed(16);
        int k = paramk.ed(16);
        if (j > 0)
        {
          arrayOfByte1 = new byte[j];
          paramk.p(arrayOfByte1, j);
        }
        if (k > 0)
        {
          byte[] arrayOfByte2 = new byte[k];
          paramk.p(arrayOfByte2, k);
          paramk = arrayOfByte2;
        }
        else
        {
          paramk = arrayOfByte1;
        }
      }
      else
      {
        paramk = null;
        arrayOfByte1 = null;
      }
    }
  }

  private static int n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }

  private static int[] sY()
  {
    return new int[] { 0, -1, -16777216, -8421505 };
  }

  private static int[] sZ()
  {
    AppMethodBeat.i(95631);
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 0;
    int i = 1;
    if (i < 16)
    {
      int j;
      label38: int k;
      if (i < 8)
      {
        if ((i & 0x1) != 0)
        {
          j = 255;
          if ((i & 0x2) == 0)
            break label83;
          k = 255;
          label48: if ((i & 0x4) == 0)
            break label88;
        }
        label83: label88: for (m = 255; ; m = 0)
        {
          arrayOfInt[i] = n(255, j, k, m);
          i++;
          break;
          j = 0;
          break label38;
          k = 0;
          break label48;
        }
      }
      if ((i & 0x1) != 0)
      {
        j = 127;
        label103: if ((i & 0x2) == 0)
          break label143;
        k = 127;
        label112: if ((i & 0x4) == 0)
          break label148;
      }
      label143: label148: for (int m = 127; ; m = 0)
      {
        arrayOfInt[i] = n(255, j, k, m);
        break;
        j = 0;
        break label103;
        k = 0;
        break label112;
      }
    }
    AppMethodBeat.o(95631);
    return arrayOfInt;
  }

  private static int[] ta()
  {
    AppMethodBeat.i(95632);
    int[] arrayOfInt = new int[256];
    arrayOfInt[0] = 0;
    int i = 0;
    if (i < 256)
    {
      int j;
      label40: int k;
      label50: int m;
      if (i < 8)
        if ((i & 0x1) != 0)
        {
          j = 255;
          if ((i & 0x2) == 0)
            break label84;
          k = 255;
          if ((i & 0x4) == 0)
            break label89;
          m = 255;
          label61: arrayOfInt[i] = n(63, j, k, m);
        }
      while (true)
      {
        i++;
        break;
        j = 0;
        break label40;
        label84: k = 0;
        break label50;
        label89: m = 0;
        break label61;
        switch (i & 0x88)
        {
        default:
        case 0:
        case 8:
        case 128:
        case 136:
        }
      }
      label156: label167: label177: int n;
      label189: int i1;
      if ((i & 0x1) != 0)
      {
        j = 85;
        if ((i & 0x10) == 0)
          break label241;
        k = 170;
        if ((i & 0x2) == 0)
          break label246;
        m = 85;
        if ((i & 0x20) == 0)
          break label252;
        n = 170;
        if ((i & 0x4) == 0)
          break label258;
        i1 = 85;
        label199: if ((i & 0x40) == 0)
          break label264;
      }
      label258: label264: for (int i2 = 170; ; i2 = 0)
      {
        arrayOfInt[i] = n(255, j + k, m + n, i2 + i1);
        break;
        j = 0;
        break label156;
        label241: k = 0;
        break label167;
        label246: m = 0;
        break label177;
        label252: n = 0;
        break label189;
        i1 = 0;
        break label199;
      }
      if ((i & 0x1) != 0)
      {
        j = 85;
        label279: if ((i & 0x10) == 0)
          break label363;
        k = 170;
        label290: if ((i & 0x2) == 0)
          break label368;
        m = 85;
        label300: if ((i & 0x20) == 0)
          break label374;
        n = 170;
        label312: if ((i & 0x4) == 0)
          break label380;
        i1 = 85;
        label322: if ((i & 0x40) == 0)
          break label386;
      }
      label386: for (i2 = 170; ; i2 = 0)
      {
        arrayOfInt[i] = n(127, j + k, m + n, i2 + i1);
        break;
        j = 0;
        break label279;
        label363: k = 0;
        break label290;
        label368: m = 0;
        break label300;
        label374: n = 0;
        break label312;
        label380: i1 = 0;
        break label322;
      }
      if ((i & 0x1) != 0)
      {
        j = 43;
        label401: if ((i & 0x10) == 0)
          break label492;
        k = 85;
        label411: if ((i & 0x2) == 0)
          break label497;
        m = 43;
        label421: if ((i & 0x20) == 0)
          break label503;
        n = 85;
        label432: if ((i & 0x4) == 0)
          break label509;
        i1 = 43;
        label442: if ((i & 0x40) == 0)
          break label515;
      }
      label515: for (i2 = 85; ; i2 = 0)
      {
        arrayOfInt[i] = n(255, j + 127 + k, m + 127 + n, i2 + (i1 + 127));
        break;
        j = 0;
        break label401;
        label492: k = 0;
        break label411;
        label497: m = 0;
        break label421;
        label503: n = 0;
        break label432;
        label509: i1 = 0;
        break label442;
      }
      if ((i & 0x1) != 0)
      {
        j = 43;
        label530: if ((i & 0x10) == 0)
          break label612;
        k = 85;
        label540: if ((i & 0x2) == 0)
          break label617;
        m = 43;
        label550: if ((i & 0x20) == 0)
          break label623;
        n = 85;
        label561: if ((i & 0x4) == 0)
          break label629;
        i1 = 43;
        label571: if ((i & 0x40) == 0)
          break label635;
      }
      label612: label617: label623: label629: label635: for (i2 = 85; ; i2 = 0)
      {
        arrayOfInt[i] = n(255, j + k, m + n, i2 + i1);
        break;
        j = 0;
        break label530;
        k = 0;
        break label540;
        m = 0;
        break label550;
        n = 0;
        break label561;
        i1 = 0;
        break label571;
      }
    }
    AppMethodBeat.o(95632);
    return arrayOfInt;
  }

  public final List<com.google.android.exoplayer2.f.a> g(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95627);
    Object localObject1 = new k(paramArrayOfByte, paramInt);
    int i;
    int j;
    label128: int m;
    int n;
    int i1;
    int i2;
    Object localObject3;
    while ((((k)localObject1).tx() >= 48) && (((k)localObject1).ed(8) == 15))
    {
      paramArrayOfByte = this.bmJ;
      i = ((k)localObject1).ed(8);
      paramInt = ((k)localObject1).ed(16);
      j = ((k)localObject1).ed(16);
      int k = ((k)localObject1).ty();
      if (j * 8 > ((k)localObject1).tx())
      {
        ((k)localObject1).ee(((k)localObject1).tx());
      }
      else
      {
        switch (i)
        {
        default:
          paramInt = ((k)localObject1).ty();
          if (((k)localObject1).baG != 0)
            break;
        case 20:
        case 16:
        case 17:
        case 18:
        case 19:
        }
        for (boolean bool = true; ; bool = false)
        {
          com.google.android.exoplayer2.i.a.checkState(bool);
          ((k)localObject1).baF += k + j - paramInt;
          ((k)localObject1).rm();
          break;
          if (paramInt != paramArrayOfByte.bnl)
            break label128;
          ((k)localObject1).ee(4);
          bool = ((k)localObject1).rl();
          ((k)localObject1).ee(3);
          m = ((k)localObject1).ed(16);
          n = ((k)localObject1).ed(16);
          if (bool)
          {
            i1 = ((k)localObject1).ed(16);
            i = ((k)localObject1).ed(16);
            paramInt = ((k)localObject1).ed(16);
            i2 = ((k)localObject1).ed(16);
          }
          while (true)
          {
            paramArrayOfByte.bnr = new b.b(m, n, i1, i, paramInt, i2);
            break;
            i1 = 0;
            paramInt = 0;
            i2 = n;
            i = m;
          }
          if (paramInt != paramArrayOfByte.bnl)
            break label128;
          localObject2 = paramArrayOfByte.bns;
          i2 = ((k)localObject1).ed(8);
          i = ((k)localObject1).ed(4);
          i1 = ((k)localObject1).ed(2);
          ((k)localObject1).ee(2);
          paramInt = j - 2;
          localObject3 = new SparseArray();
          while (paramInt > 0)
          {
            int i3 = ((k)localObject1).ed(8);
            ((k)localObject1).ee(8);
            n = ((k)localObject1).ed(16);
            m = ((k)localObject1).ed(16);
            paramInt -= 6;
            ((SparseArray)localObject3).put(i3, new b.e(n, m));
          }
          localObject3 = new b.d(i2, i, i1, (SparseArray)localObject3);
          if (((b.d)localObject3).state != 0)
          {
            paramArrayOfByte.bns = ((b.d)localObject3);
            paramArrayOfByte.bmV.clear();
            paramArrayOfByte.bnn.clear();
            paramArrayOfByte.bno.clear();
            break label128;
          }
          if ((localObject2 == null) || (((b.d)localObject2).version == ((b.d)localObject3).version))
            break label128;
          paramArrayOfByte.bns = ((b.d)localObject3);
          break label128;
          localObject2 = paramArrayOfByte.bns;
          if ((paramInt != paramArrayOfByte.bnl) || (localObject2 == null))
            break label128;
          localObject3 = a((k)localObject1, j);
          if (((b.d)localObject2).state == 0)
            ((b.f)localObject3).a((b.f)paramArrayOfByte.bmV.get(((b.f)localObject3).id));
          paramArrayOfByte.bmV.put(((b.f)localObject3).id, localObject3);
          break label128;
          if (paramInt == paramArrayOfByte.bnl)
          {
            localObject2 = b((k)localObject1, j);
            paramArrayOfByte.bnn.put(((b.a)localObject2).id, localObject2);
            break label128;
          }
          if (paramInt != paramArrayOfByte.bnm)
            break label128;
          localObject2 = b((k)localObject1, j);
          paramArrayOfByte.bnp.put(((b.a)localObject2).id, localObject2);
          break label128;
          if (paramInt == paramArrayOfByte.bnl)
          {
            localObject2 = b((k)localObject1);
            paramArrayOfByte.bno.put(((b.c)localObject2).id, localObject2);
            break label128;
          }
          if (paramInt != paramArrayOfByte.bnm)
            break label128;
          localObject2 = b((k)localObject1);
          paramArrayOfByte.bnq.put(((b.c)localObject2).id, localObject2);
          break label128;
        }
      }
    }
    if (this.bmJ.bns == null)
    {
      paramArrayOfByte = Collections.emptyList();
      AppMethodBeat.o(95627);
      return paramArrayOfByte;
    }
    ArrayList localArrayList;
    b.f localf;
    if (this.bmJ.bnr != null)
    {
      localObject1 = this.bmJ.bnr;
      if ((this.bitmap == null) || (((b.b)localObject1).width + 1 != this.bitmap.getWidth()) || (((b.b)localObject1).height + 1 != this.bitmap.getHeight()))
      {
        this.bitmap = Bitmap.createBitmap(((b.b)localObject1).width + 1, ((b.b)localObject1).height + 1, Bitmap.Config.ARGB_8888);
        this.bmG.setBitmap(this.bitmap);
      }
      localArrayList = new ArrayList();
      SparseArray localSparseArray1 = this.bmJ.bns.bmV;
      i = 0;
      if (i >= localSparseArray1.size())
        break label1435;
      paramArrayOfByte = (b.e)localSparseArray1.valueAt(i);
      paramInt = localSparseArray1.keyAt(i);
      localf = (b.f)this.bmJ.bmV.get(paramInt);
      i2 = paramArrayOfByte.bmW + ((b.b)localObject1).bmN;
      i1 = paramArrayOfByte.bmX + ((b.b)localObject1).bmP;
      paramInt = Math.min(localf.width + i2, ((b.b)localObject1).bmO);
      m = Math.min(localf.height + i1, ((b.b)localObject1).bmQ);
      this.bmG.clipRect(i2, i1, paramInt, m, Region.Op.REPLACE);
      localObject2 = (b.a)this.bmJ.bnn.get(localf.bnb);
      paramArrayOfByte = (byte[])localObject2;
      if (localObject2 != null)
        break label1449;
      localObject2 = (b.a)this.bmJ.bnp.get(localf.bnb);
      paramArrayOfByte = (byte[])localObject2;
      if (localObject2 != null)
        break label1449;
    }
    label1435: label1446: label1449: for (Object localObject2 = this.bmI; ; localObject2 = paramArrayOfByte)
    {
      SparseArray localSparseArray2 = localf.bnf;
      paramInt = 0;
      label1017: if (paramInt < localSparseArray2.size())
      {
        m = localSparseArray2.keyAt(paramInt);
        paramArrayOfByte = (b.g)localSparseArray2.valueAt(paramInt);
        localObject3 = (b.c)this.bmJ.bno.get(m);
        if (localObject3 != null)
          break label1446;
        localObject3 = (b.c)this.bmJ.bnq.get(m);
      }
      while (true)
      {
        Paint localPaint;
        label1099: Canvas localCanvas;
        if (localObject3 != null)
        {
          if (!((b.c)localObject3).bmR)
            break label1196;
          localPaint = null;
          j = localf.bna;
          m = i2 + paramArrayOfByte.bnh;
          n = i1 + paramArrayOfByte.bni;
          localCanvas = this.bmG;
          if (j != 3)
            break label1205;
          paramArrayOfByte = ((b.a)localObject2).bmM;
        }
        while (true)
        {
          a(((b.c)localObject3).bmS, paramArrayOfByte, j, m, n, localPaint, localCanvas);
          a(((b.c)localObject3).bmT, paramArrayOfByte, j, m, n + 1, localPaint, localCanvas);
          paramInt++;
          break label1017;
          localObject1 = this.bmH;
          break;
          label1196: localPaint = this.bmE;
          break label1099;
          label1205: if (j == 2)
            paramArrayOfByte = ((b.a)localObject2).bmL;
          else
            paramArrayOfByte = ((b.a)localObject2).bmK;
        }
        if (localf.bmY)
        {
          if (localf.bna != 3)
            break label1396;
          paramInt = localObject2.bmM[localf.bnc];
        }
        while (true)
        {
          this.bmF.setColor(paramInt);
          this.bmG.drawRect(i2, i1, localf.width + i2, localf.height + i1, this.bmF);
          localArrayList.add(new com.google.android.exoplayer2.f.a(Bitmap.createBitmap(this.bitmap, i2, i1, localf.width, localf.height), i2 / ((b.b)localObject1).width, i1 / ((b.b)localObject1).height, localf.width / ((b.b)localObject1).width, localf.height / ((b.b)localObject1).height));
          this.bmG.drawColor(0, PorterDuff.Mode.CLEAR);
          i++;
          break;
          label1396: if (localf.bna == 2)
            paramInt = localObject2.bmL[localf.bnd];
          else
            paramInt = localObject2.bmK[localf.bne];
        }
        AppMethodBeat.o(95627);
        paramArrayOfByte = localArrayList;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.b.b
 * JD-Core Version:    0.6.2
 */