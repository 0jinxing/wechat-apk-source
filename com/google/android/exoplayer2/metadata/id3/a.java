package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class a
  implements com.google.android.exoplayer2.metadata.a
{
  public static final int bbg;
  private final a.a bfv;

  static
  {
    AppMethodBeat.i(95321);
    bbg = v.aT("ID3");
    AppMethodBeat.o(95321);
  }

  public a()
  {
    this(null);
  }

  public a(a.a parama)
  {
    this.bfv = parama;
  }

  private static ChapterFrame a(l paraml, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a.a parama)
  {
    AppMethodBeat.i(95315);
    int i = paraml.position;
    int j = e(paraml.data, i);
    String str = new String(paraml.data, i, j - i, "ISO-8859-1");
    paraml.setPosition(j + 1);
    j = paraml.readInt();
    int k = paraml.readInt();
    long l1 = paraml.cM();
    long l2 = l1;
    if (l1 == 4294967295L)
      l2 = -1L;
    long l3 = paraml.cM();
    l1 = l3;
    if (l3 == 4294967295L)
      l1 = -1L;
    ArrayList localArrayList = new ArrayList();
    while (paraml.position < i + paramInt1)
    {
      Id3Frame localId3Frame = a(paramInt2, paraml, paramBoolean, paramInt3, parama);
      if (localId3Frame != null)
        localArrayList.add(localId3Frame);
    }
    paraml = new Id3Frame[localArrayList.size()];
    localArrayList.toArray(paraml);
    paraml = new ChapterFrame(str, j, k, l2, l1, paraml);
    AppMethodBeat.o(95315);
    return paraml;
  }

  private static Id3Frame a(int paramInt1, l paraml, boolean paramBoolean, int paramInt2, a.a parama)
  {
    AppMethodBeat.i(95314);
    int i = paraml.readUnsignedByte();
    int j = paraml.readUnsignedByte();
    int k = paraml.readUnsignedByte();
    int m;
    int i1;
    label100: int i2;
    if (paramInt1 >= 3)
    {
      m = paraml.readUnsignedByte();
      if (paramInt1 != 4)
        break label166;
      n = paraml.tI();
      i1 = n;
      if (!paramBoolean)
        i1 = n & 0xFF | (n >> 8 & 0xFF) << 7 | (n >> 16 & 0xFF) << 14 | (n >> 24 & 0xFF) << 21;
      if (paramInt1 < 3)
        break label189;
      i2 = paraml.readUnsignedShort();
      label111: if ((i != 0) || (j != 0) || (k != 0) || (m != 0) || (i1 != 0) || (i2 != 0))
        break label195;
      paraml.setPosition(paraml.limit);
      parama = null;
      AppMethodBeat.o(95314);
    }
    label166: label189: label195: int i3;
    while (true)
    {
      return parama;
      m = 0;
      break;
      if (paramInt1 == 3)
      {
        i1 = paraml.tI();
        break label100;
      }
      i1 = paraml.tD();
      break label100;
      i2 = 0;
      break label111;
      i3 = paraml.position + i1;
      if (i3 > paraml.limit)
      {
        paraml.setPosition(paraml.limit);
        parama = null;
        AppMethodBeat.o(95314);
      }
      else
      {
        if ((parama == null) || (parama.f(paramInt1, i, j, k, m)))
          break label273;
        paraml.setPosition(i3);
        parama = null;
        AppMethodBeat.o(95314);
      }
    }
    label273: int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int n = 0;
    int i7 = 0;
    if (paramInt1 == 3)
      if ((i2 & 0x80) != 0)
      {
        n = 1;
        label305: if ((i2 & 0x40) == 0)
          break label384;
        i7 = 1;
        label316: if ((i2 & 0x20) == 0)
          break label390;
        i4 = 1;
        label327: i2 = n;
        int i8 = i4;
        i4 = n;
        i5 = i7;
        i7 = i8;
        n = i2;
      }
    while (true)
    {
      if ((i4 == 0) && (i5 == 0))
        break label502;
      paraml.setPosition(i3);
      parama = null;
      AppMethodBeat.o(95314);
      break;
      n = 0;
      break label305;
      label384: i7 = 0;
      break label316;
      label390: i4 = 0;
      break label327;
      if (paramInt1 == 4)
      {
        if ((i2 & 0x40) != 0)
        {
          n = 1;
          label412: if ((i2 & 0x8) == 0)
            break label470;
          i4 = 1;
          label423: if ((i2 & 0x4) == 0)
            break label476;
          i5 = 1;
          label433: if ((i2 & 0x2) == 0)
            break label482;
        }
        label470: label476: label482: for (i6 = 1; ; i6 = 0)
        {
          if ((i2 & 0x1) == 0)
            break label488;
          i2 = 1;
          i7 = n;
          n = i2;
          break;
          n = 0;
          break label412;
          i4 = 0;
          break label423;
          i5 = 0;
          break label433;
        }
        label488: i2 = 0;
        i7 = n;
        n = i2;
      }
    }
    label502: if (i7 != 0)
    {
      i7 = i1 - 1;
      paraml.eM(1);
    }
    while (true)
    {
      i1 = i7;
      if (n != 0)
      {
        i1 = i7 - 4;
        paraml.eM(4);
      }
      n = i1;
      if (i6 != 0)
        n = f(paraml, i1);
      if ((i == 84) && (j == 88) && (k == 88) && ((paramInt1 == 2) || (m == 88)))
        if (n <= 0)
          parama = null;
      while (true)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        while (true)
        {
          if (parama == null);
          try
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Failed to decode frame: id=");
            ((StringBuilder)localObject1).append(g(paramInt1, i, j, k, m)).append(", frameSize=").append(n);
            paraml.setPosition(i3);
            AppMethodBeat.o(95314);
            break;
            i1 = paraml.readUnsignedByte();
            localObject2 = ek(i1);
            localObject3 = new byte[n - 1];
            paraml.readBytes((byte[])localObject3, 0, n - 1);
            paramInt2 = h((byte[])localObject3, 0, i1);
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>((byte[])localObject3, 0, paramInt2, (String)localObject2);
            paramInt2 += el(i1);
            if (paramInt2 < localObject3.length)
            {
              i1 = h((byte[])localObject3, paramInt2, i1);
              parama = new java/lang/String;
              parama.<init>((byte[])localObject3, paramInt2, i1 - paramInt2, (String)localObject2);
              parama = new TextInformationFrame("TXXX", (String)localObject1, parama);
            }
          }
          catch (UnsupportedEncodingException parama)
          {
            while (true)
            {
              paraml.setPosition(i3);
              parama = null;
              AppMethodBeat.o(95314);
              break;
              parama = "";
            }
            if (i == 84)
            {
              localObject2 = g(paramInt1, i, j, k, m);
              if (n <= 0)
              {
                parama = null;
                continue;
              }
              paramInt2 = paraml.readUnsignedByte();
              localObject1 = ek(paramInt2);
              parama = new byte[n - 1];
              paraml.readBytes(parama, 0, n - 1);
              paramInt2 = h(parama, 0, paramInt2);
              localObject3 = new java/lang/String;
              ((String)localObject3).<init>(parama, 0, paramInt2, (String)localObject1);
              parama = new TextInformationFrame((String)localObject2, null, (String)localObject3);
            }
          }
          finally
          {
            paraml.setPosition(i3);
            AppMethodBeat.o(95314);
          }
        }
        if ((i == 87) && (j == 88) && (k == 88) && ((paramInt1 == 2) || (m == 88)))
        {
          if (n <= 0)
          {
            parama = null;
          }
          else
          {
            paramInt2 = paraml.readUnsignedByte();
            parama = ek(paramInt2);
            localObject2 = new byte[n - 1];
            paraml.readBytes((byte[])localObject2, 0, n - 1);
            i1 = h((byte[])localObject2, 0, paramInt2);
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>((byte[])localObject2, 0, i1, parama);
            paramInt2 = i1 + el(paramInt2);
            if (paramInt2 < localObject2.length)
            {
              i1 = e((byte[])localObject2, paramInt2);
              parama = new java/lang/String;
              parama.<init>((byte[])localObject2, paramInt2, i1 - paramInt2, "ISO-8859-1");
            }
            while (true)
            {
              parama = new UrlLinkFrame("WXXX", (String)localObject1, parama);
              break;
              parama = "";
            }
          }
        }
        else if (i == 87)
        {
          localObject1 = g(paramInt1, i, j, k, m);
          localObject2 = new byte[n];
          paraml.readBytes((byte[])localObject2, 0, n);
          paramInt2 = e((byte[])localObject2, 0);
          parama = new java/lang/String;
          parama.<init>((byte[])localObject2, 0, paramInt2, "ISO-8859-1");
          parama = new UrlLinkFrame((String)localObject1, null, parama);
        }
        else if ((i == 80) && (j == 82) && (k == 73) && (m == 86))
        {
          parama = new byte[n];
          paraml.readBytes(parama, 0, n);
          paramInt2 = e(parama, 0);
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(parama, 0, paramInt2, "ISO-8859-1");
          parama = new PrivFrame((String)localObject1, i(parama, paramInt2 + 1, parama.length));
        }
        else
        {
          Object localObject4;
          if ((i == 71) && (j == 69) && (k == 79) && ((m == 66) || (paramInt1 == 2)))
          {
            paramInt2 = paraml.readUnsignedByte();
            parama = ek(paramInt2);
            localObject1 = new byte[n - 1];
            paraml.readBytes((byte[])localObject1, 0, n - 1);
            i1 = e((byte[])localObject1, 0);
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((byte[])localObject1, 0, i1, "ISO-8859-1");
            i7 = i1 + 1;
            i1 = h((byte[])localObject1, i7, paramInt2);
            localObject3 = new java/lang/String;
            ((String)localObject3).<init>((byte[])localObject1, i7, i1 - i7, parama);
            i1 = el(paramInt2) + i1;
            i7 = h((byte[])localObject1, i1, paramInt2);
            localObject4 = new java/lang/String;
            ((String)localObject4).<init>((byte[])localObject1, i1, i7 - i1, parama);
            parama = new GeobFrame((String)localObject2, (String)localObject3, (String)localObject4, i((byte[])localObject1, el(paramInt2) + i7, localObject1.length));
          }
          else
          {
            if (paramInt1 == 2)
            {
              if ((i != 80) || (j != 73) || (k != 67))
                break label1692;
              label1477: i7 = paraml.readUnsignedByte();
              localObject2 = ek(i7);
              localObject3 = new byte[n - 1];
              paraml.readBytes((byte[])localObject3, 0, n - 1);
              if (paramInt1 != 2)
                break label1737;
              i1 = 2;
              parama = new java/lang/StringBuilder;
              parama.<init>("image/");
              localObject1 = new java/lang/String;
              ((String)localObject1).<init>((byte[])localObject3, 0, 3, "ISO-8859-1");
              localObject1 = v.aR((String)localObject1);
              paramInt2 = i1;
              parama = (a.a)localObject1;
              if (((String)localObject1).equals("image/jpg"))
              {
                parama = "image/jpeg";
                paramInt2 = i1;
              }
            }
            while (true)
            {
              i1 = localObject3[(paramInt2 + 1)];
              i4 = paramInt2 + 2;
              paramInt2 = h((byte[])localObject3, i4, i7);
              localObject1 = new java/lang/String;
              ((String)localObject1).<init>((byte[])localObject3, i4, paramInt2 - i4, (String)localObject2);
              parama = new ApicFrame(parama, (String)localObject1, i1 & 0xFF, i((byte[])localObject3, el(i7) + paramInt2, localObject3.length));
              break;
              if ((i == 65) && (j == 80) && (k == 73) && (m == 67))
                break label1477;
              label1692: if ((i != 67) || (j != 79) || (k != 77) || ((m != 77) && (paramInt1 != 2)))
                break label1958;
              if (n >= 4)
                break label1805;
              parama = null;
              break;
              label1737: i1 = e((byte[])localObject3, 0);
              parama = new java/lang/String;
              parama.<init>((byte[])localObject3, 0, i1, "ISO-8859-1");
              localObject1 = v.aR(parama);
              paramInt2 = i1;
              parama = (a.a)localObject1;
              if (((String)localObject1).indexOf('/') == -1)
              {
                parama = "image/".concat(String.valueOf(localObject1));
                paramInt2 = i1;
              }
            }
            label1805: i1 = paraml.readUnsignedByte();
            localObject3 = ek(i1);
            parama = new byte[3];
            paraml.readBytes(parama, 0, 3);
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(parama, 0, 3);
            localObject4 = new byte[n - 4];
            paraml.readBytes((byte[])localObject4, 0, n - 4);
            paramInt2 = h((byte[])localObject4, 0, i1);
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((byte[])localObject4, 0, paramInt2, (String)localObject3);
            paramInt2 += el(i1);
            if (paramInt2 < localObject4.length)
            {
              i1 = h((byte[])localObject4, paramInt2, i1);
              parama = new java/lang/String;
              parama.<init>((byte[])localObject4, paramInt2, i1 - paramInt2, (String)localObject3);
            }
            while (true)
            {
              parama = new CommentFrame((String)localObject1, (String)localObject2, parama);
              break;
              parama = "";
            }
            label1958: if ((i == 67) && (j == 72) && (k == 65) && (m == 80))
            {
              parama = a(paraml, n, paramInt1, paramBoolean, paramInt2, parama);
            }
            else if ((i == 67) && (j == 84) && (k == 79) && (m == 67))
            {
              parama = b(paraml, n, paramInt1, paramBoolean, paramInt2, parama);
            }
            else
            {
              parama = g(paramInt1, i, j, k, m);
              localObject1 = new byte[n];
              paraml.readBytes((byte[])localObject1, 0, n);
              parama = new BinaryFrame(parama, (byte[])localObject1);
            }
          }
        }
      }
      i7 = i1;
    }
  }

  private static boolean a(l paraml, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(95313);
    int i = paraml.position;
    label404: label410: 
    while (true)
    {
      try
      {
        if (paraml.tB() >= paramInt2)
        {
          int k;
          if (paramInt1 >= 3)
          {
            j = paraml.readInt();
            l = paraml.cM();
            k = paraml.readUnsignedShort();
            if ((j == 0) && (l == 0L) && (k == 0))
            {
              paraml.setPosition(i);
              paramBoolean = true;
              AppMethodBeat.o(95313);
              return paramBoolean;
            }
          }
          else
          {
            j = paraml.tD();
            m = paraml.tD();
            l = m;
            k = 0;
            continue;
          }
          if ((paramInt1 != 4) || (paramBoolean))
            break label410;
          if ((0x808080 & l) != 0L)
          {
            paraml.setPosition(i);
            paramBoolean = false;
            AppMethodBeat.o(95313);
            continue;
          }
          long l = (l >> 24 & 0xFF) << 21 | (0xFF & l | (l >> 8 & 0xFF) << 7 | (l >> 16 & 0xFF) << 14);
          int m = 0;
          if (paramInt1 == 4)
          {
            if ((k & 0x40) != 0)
            {
              j = 1;
              if ((k & 0x1) == 0)
                continue;
              m = 1;
              k = m;
              m = j;
              j = k;
              k = 0;
              if (m != 0)
                k = 1;
              m = k;
              if (j != 0)
                m = k + 4;
              if (l >= m)
                continue;
              paraml.setPosition(i);
              paramBoolean = false;
              AppMethodBeat.o(95313);
              continue;
            }
            j = 0;
            continue;
            m = 0;
            continue;
          }
          if (paramInt1 != 3)
            break label404;
          if ((k & 0x20) != 0)
          {
            m = 1;
            if ((k & 0x80) == 0)
              continue;
            j = 1;
            continue;
          }
          m = 0;
          continue;
          j = 0;
          continue;
          j = paraml.tB();
          if (j < l)
          {
            paraml.setPosition(i);
            paramBoolean = false;
            AppMethodBeat.o(95313);
            continue;
          }
          j = (int)l;
          paraml.eM(j);
          continue;
        }
      }
      finally
      {
        paraml.setPosition(i);
        AppMethodBeat.o(95313);
      }
      paraml.setPosition(i);
      paramBoolean = true;
      AppMethodBeat.o(95313);
      continue;
      int j = 0;
    }
  }

  private static ChapterTocFrame b(l paraml, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a.a parama)
  {
    AppMethodBeat.i(95316);
    int i = paraml.position;
    int j = e(paraml.data, i);
    String str = new String(paraml.data, i, j - i, "ISO-8859-1");
    paraml.setPosition(j + 1);
    j = paraml.readUnsignedByte();
    boolean bool1;
    if ((j & 0x2) != 0)
    {
      bool1 = true;
      if ((j & 0x1) == 0)
        break label163;
    }
    String[] arrayOfString;
    label163: for (boolean bool2 = true; ; bool2 = false)
    {
      int k = paraml.readUnsignedByte();
      arrayOfString = new String[k];
      for (j = 0; j < k; j++)
      {
        int m = paraml.position;
        int n = e(paraml.data, m);
        arrayOfString[j] = new String(paraml.data, m, n - m, "ISO-8859-1");
        paraml.setPosition(n + 1);
      }
      bool1 = false;
      break;
    }
    ArrayList localArrayList = new ArrayList();
    while (paraml.position < i + paramInt1)
    {
      Id3Frame localId3Frame = a(paramInt2, paraml, paramBoolean, paramInt3, parama);
      if (localId3Frame != null)
        localArrayList.add(localId3Frame);
    }
    paraml = new Id3Frame[localArrayList.size()];
    localArrayList.toArray(paraml);
    paraml = new ChapterTocFrame(str, bool1, bool2, arrayOfString, paraml);
    AppMethodBeat.o(95316);
    return paraml;
  }

  private static int e(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt < paramArrayOfByte.length)
      if (paramArrayOfByte[paramInt] != 0);
    while (true)
    {
      return paramInt;
      paramInt++;
      break;
      paramInt = paramArrayOfByte.length;
    }
  }

  private static String ek(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "ISO-8859-1";
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str;
      str = "ISO-8859-1";
      continue;
      str = "UTF-16";
      continue;
      str = "UTF-16BE";
      continue;
      str = "UTF-8";
    }
  }

  private static int el(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 3));
    for (paramInt = 1; ; paramInt = 2)
      return paramInt;
  }

  private static int f(l paraml, int paramInt)
  {
    AppMethodBeat.i(95317);
    byte[] arrayOfByte = paraml.data;
    int i = paraml.position;
    int j = paramInt;
    paramInt = i;
    while (paramInt + 1 < j)
    {
      i = j;
      if ((arrayOfByte[paramInt] & 0xFF) == 255)
      {
        i = j;
        if (arrayOfByte[(paramInt + 1)] == 0)
        {
          System.arraycopy(arrayOfByte, paramInt + 2, arrayOfByte, paramInt + 1, j - paramInt - 2);
          i = j - 1;
        }
      }
      paramInt++;
      j = i;
    }
    AppMethodBeat.o(95317);
    return j;
  }

  private static String g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(95318);
    String str;
    if (paramInt1 == 2)
    {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      AppMethodBeat.o(95318);
    }
    while (true)
    {
      return str;
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      AppMethodBeat.o(95318);
    }
  }

  private static int h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95319);
    int i = e(paramArrayOfByte, paramInt1);
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (paramInt2 != 3);
    }
    else
    {
      AppMethodBeat.o(95319);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      do
      {
        paramInt1 = e(paramArrayOfByte, paramInt1 + 1);
        if (paramInt1 >= paramArrayOfByte.length - 1)
          break;
      }
      while ((paramInt1 % 2 != 0) || (paramArrayOfByte[(paramInt1 + 1)] != 0));
      AppMethodBeat.o(95319);
      continue;
      paramInt1 = paramArrayOfByte.length;
      AppMethodBeat.o(95319);
    }
  }

  private static byte[] i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95320);
    if (paramInt2 <= paramInt1)
    {
      paramArrayOfByte = new byte[0];
      AppMethodBeat.o(95320);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(95320);
    }
  }

  private static a.b x(l paraml)
  {
    AppMethodBeat.i(95312);
    if (paraml.tB() < 10)
      AppMethodBeat.o(95312);
    for (paraml = null; ; paraml = null)
    {
      return paraml;
      if (paraml.tD() == bbg)
        break;
      AppMethodBeat.o(95312);
    }
    int i = paraml.readUnsignedByte();
    paraml.eM(1);
    int j = paraml.readUnsignedByte();
    int k = paraml.tH();
    int m;
    if (i == 2)
    {
      if ((j & 0x40) != 0);
      for (m = 1; ; m = 0)
      {
        if (m == 0)
          break label103;
        AppMethodBeat.o(95312);
        paraml = null;
        break;
      }
      label103: if ((i >= 4) || ((j & 0x80) == 0))
        break label288;
    }
    label271: label288: for (boolean bool = true; ; bool = false)
    {
      paraml = new a.b(i, bool, k);
      AppMethodBeat.o(95312);
      break;
      int n;
      if (i == 3)
      {
        if ((j & 0x40) != 0);
        for (n = 1; ; n = 0)
        {
          m = k;
          if (n != 0)
          {
            m = paraml.readInt();
            paraml.eM(m);
            m = k - (m + 4);
          }
          k = m;
          break;
        }
      }
      if (i == 4)
      {
        if ((j & 0x40) != 0)
        {
          n = 1;
          label210: m = k;
          if (n != 0)
          {
            m = paraml.tH();
            paraml.eM(m - 4);
            m = k - m;
          }
          if ((j & 0x10) == 0)
            break label271;
        }
        for (n = 1; ; n = 0)
        {
          k = m;
          if (n != 0)
            k = m - 10;
          break;
          n = 0;
          break label210;
        }
      }
      AppMethodBeat.o(95312);
      paraml = null;
      break;
    }
  }

  public final Metadata a(d paramd)
  {
    AppMethodBeat.i(95310);
    paramd = paramd.aEY;
    paramd = d(paramd.array(), paramd.limit());
    AppMethodBeat.o(95310);
    return paramd;
  }

  public final Metadata d(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95311);
    ArrayList localArrayList = new ArrayList();
    l locall = new l(paramArrayOfByte, paramInt);
    a.b localb = x(locall);
    if (localb == null)
    {
      AppMethodBeat.o(95311);
      paramArrayOfByte = null;
      return paramArrayOfByte;
    }
    int i = locall.position;
    label66: boolean bool;
    if (localb.bfw == 2)
    {
      paramInt = 6;
      int j = localb.bfy;
      if (localb.bfx)
        j = f(locall, localb.bfy);
      locall.eL(j + i);
      if (a(locall, localb.bfw, paramInt, false))
        break label237;
      if ((localb.bfw != 4) || (!a(locall, 4, paramInt, true)))
        break label189;
      bool = true;
    }
    while (true)
    {
      if (locall.tB() >= paramInt)
      {
        paramArrayOfByte = a(localb.bfw, locall, bool, paramInt, this.bfv);
        if (paramArrayOfByte == null)
          continue;
        localArrayList.add(paramArrayOfByte);
        continue;
        paramInt = 10;
        break label66;
        label189: new StringBuilder("Failed to validate ID3 tag with majorVersion=").append(localb.bfw);
        AppMethodBeat.o(95311);
        paramArrayOfByte = null;
        break;
      }
      paramArrayOfByte = new Metadata(localArrayList);
      AppMethodBeat.o(95311);
      break;
      label237: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.a
 * JD-Core Version:    0.6.2
 */