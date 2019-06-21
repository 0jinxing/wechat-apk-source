package android.support.v4.a;

import android.graphics.Path;
import java.util.ArrayList;

public final class c
{
  public static Path K(String paramString)
  {
    Path localPath = new Path();
    b[] arrayOfb = L(paramString);
    if (arrayOfb != null);
    while (true)
    {
      try
      {
        b.a(arrayOfb, localPath);
        paramString = localPath;
        return paramString;
      }
      catch (RuntimeException localRuntimeException)
      {
        throw new RuntimeException("Error in parsing ".concat(String.valueOf(paramString)), localRuntimeException);
      }
      paramString = null;
    }
  }

  public static b[] L(String paramString)
  {
    if (paramString == null);
    ArrayList localArrayList;
    for (paramString = null; ; paramString = (b[])localArrayList.toArray(new b[localArrayList.size()]))
    {
      return paramString;
      localArrayList = new ArrayList();
      int i = 1;
      int j = 0;
      while (i < paramString.length())
      {
        i = f(paramString, i);
        String str = paramString.substring(j, i).trim();
        if (str.length() > 0)
        {
          float[] arrayOfFloat = M(str);
          a(localArrayList, str.charAt(0), arrayOfFloat);
        }
        int k = i + 1;
        j = i;
        i = k;
      }
      if ((i - j == 1) && (j < paramString.length()))
        a(localArrayList, paramString.charAt(j), new float[0]);
    }
  }

  private static float[] M(String paramString)
  {
    if ((paramString.charAt(0) == 'z') || (paramString.charAt(0) == 'Z'))
    {
      paramString = new float[0];
      return paramString;
    }
    while (true)
    {
      int k;
      try
      {
        float[] arrayOfFloat = new float[paramString.length()];
        Object localObject = new android/support/v4/a/c$a;
        ((a)localObject).<init>();
        int i = paramString.length();
        int j = 1;
        k = 0;
        if (j < i)
        {
          ((a)localObject).Hb = false;
          m = 0;
          int n = 0;
          int i1 = 0;
          int i2 = j;
          if (i2 < paramString.length())
            switch (paramString.charAt(i2))
            {
            default:
              m = 0;
              if (i1 == 0)
                i2++;
              break;
            case ' ':
            case ',':
              m = 0;
              i1 = 1;
              break;
            case '-':
              if ((i2 == j) || (m != 0))
                continue;
              ((a)localObject).Hb = true;
              m = 0;
              i1 = 1;
              break;
            case '.':
              if (n == 0)
              {
                m = 0;
                n = 1;
                continue;
              }
              ((a)localObject).Hb = true;
              m = 0;
              i1 = 1;
              break;
            case 'E':
            case 'e':
              m = 1;
              break;
            }
          ((a)localObject).Ha = i2;
          i1 = ((a)localObject).Ha;
          if (j >= i1)
            break label345;
          m = k + 1;
          arrayOfFloat[k] = Float.parseFloat(paramString.substring(j, i1));
          if (((a)localObject).Hb)
          {
            j = i1;
            k = m;
            continue;
          }
          j = i1 + 1;
          k = m;
          continue;
        }
        localObject = b(arrayOfFloat, k);
        paramString = (String)localObject;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new RuntimeException("error in parsing \"" + paramString + "\"", localNumberFormatException);
      }
      label345: int m = k;
    }
  }

  private static void a(ArrayList<b> paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    paramArrayList.add(new b(paramChar, paramArrayOfFloat));
  }

  public static boolean a(b[] paramArrayOfb1, b[] paramArrayOfb2)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramArrayOfb1 != null)
    {
      if (paramArrayOfb2 != null)
        break label16;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label16: bool2 = bool1;
      if (paramArrayOfb1.length == paramArrayOfb2.length)
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramArrayOfb1.length)
            break label81;
          bool2 = bool1;
          if (paramArrayOfb1[i].Hc != paramArrayOfb2[i].Hc)
            break;
          bool2 = bool1;
          if (paramArrayOfb1[i].Hd.length != paramArrayOfb2[i].Hd.length)
            break;
        }
        label81: bool2 = true;
      }
    }
  }

  public static b[] a(b[] paramArrayOfb)
  {
    if (paramArrayOfb == null);
    b[] arrayOfb;
    for (paramArrayOfb = null; ; paramArrayOfb = arrayOfb)
    {
      return paramArrayOfb;
      arrayOfb = new b[paramArrayOfb.length];
      for (int i = 0; i < paramArrayOfb.length; i++)
        arrayOfb[i] = new b(paramArrayOfb[i]);
    }
  }

  static float[] b(float[] paramArrayOfFloat, int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException();
    int i = paramArrayOfFloat.length;
    if (i < 0)
      throw new ArrayIndexOutOfBoundsException();
    paramInt += 0;
    i = Math.min(paramInt, i + 0);
    float[] arrayOfFloat = new float[paramInt];
    System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }

  private static int f(String paramString, int paramInt)
  {
    while (true)
    {
      if (paramInt < paramString.length())
      {
        int i = paramString.charAt(paramInt);
        if ((((i - 65) * (i - 90) > 0) && ((i - 97) * (i - 122) > 0)) || (i == 101) || (i == 69));
      }
      else
      {
        return paramInt;
      }
      paramInt++;
    }
  }

  static final class a
  {
    int Ha;
    boolean Hb;
  }

  public static final class b
  {
    public char Hc;
    public float[] Hd;

    b(char paramChar, float[] paramArrayOfFloat)
    {
      this.Hc = ((char)paramChar);
      this.Hd = paramArrayOfFloat;
    }

    b(b paramb)
    {
      this.Hc = ((char)paramb.Hc);
      this.Hd = c.b(paramb.Hd, paramb.Hd.length);
    }

    private static void a(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
    {
      int i = (int)Math.ceil(Math.abs(4.0D * paramDouble9 / 3.141592653589793D));
      double d1 = Math.cos(paramDouble7);
      double d2 = Math.sin(paramDouble7);
      paramDouble7 = Math.cos(paramDouble8);
      double d3 = Math.sin(paramDouble8);
      double d4 = -paramDouble3 * d1 * d3 - paramDouble4 * d2 * paramDouble7;
      d3 = paramDouble7 * (paramDouble4 * d1) + d3 * (-paramDouble3 * d2);
      double d5 = paramDouble9 / i;
      int j = 0;
      paramDouble9 = paramDouble8;
      paramDouble8 = paramDouble6;
      paramDouble7 = paramDouble5;
      paramDouble5 = d4;
      paramDouble6 = d3;
      while (j < i)
      {
        double d6 = paramDouble9 + d5;
        double d7 = Math.sin(d6);
        double d8 = Math.cos(d6);
        d4 = paramDouble3 * d1 * d8 + paramDouble1 - paramDouble4 * d2 * d7;
        d3 = paramDouble4 * d1 * d7 + (paramDouble3 * d2 * d8 + paramDouble2);
        double d9 = -paramDouble3 * d1 * d7 - paramDouble4 * d2 * d8;
        d8 = d8 * (paramDouble4 * d1) + d7 * (-paramDouble3 * d2);
        d7 = Math.tan((d6 - paramDouble9) / 2.0D);
        paramDouble9 = Math.sin(d6 - paramDouble9);
        paramDouble9 = (Math.sqrt(d7 * (3.0D * d7) + 4.0D) - 1.0D) * paramDouble9 / 3.0D;
        paramPath.rLineTo(0.0F, 0.0F);
        paramPath.cubicTo((float)(paramDouble5 * paramDouble9 + paramDouble7), (float)(paramDouble8 + paramDouble6 * paramDouble9), (float)(d4 - paramDouble9 * d9), (float)(d3 - paramDouble9 * d8), (float)d4, (float)d3);
        paramDouble6 = d8;
        paramDouble5 = d9;
        paramDouble9 = d6;
        j++;
        paramDouble8 = d3;
        paramDouble7 = d4;
      }
    }

    private static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
    {
      double d1;
      double d2;
      double d3;
      double d4;
      double d5;
      double d7;
      double d8;
      double d9;
      double d10;
      double d11;
      double d13;
      while (true)
      {
        d1 = Math.toRadians(paramFloat7);
        d2 = Math.cos(d1);
        d3 = Math.sin(d1);
        d4 = (paramFloat1 * d2 + paramFloat2 * d3) / paramFloat5;
        d5 = (-paramFloat1 * d3 + paramFloat2 * d2) / paramFloat6;
        d6 = (paramFloat3 * d2 + paramFloat4 * d3) / paramFloat5;
        d7 = (-paramFloat3 * d3 + paramFloat4 * d2) / paramFloat6;
        d8 = d4 - d6;
        d9 = d5 - d7;
        d10 = (d4 + d6) / 2.0D;
        d11 = (d5 + d7) / 2.0D;
        d12 = d8 * d8 + d9 * d9;
        if (d12 == 0.0D)
          return;
        d13 = 1.0D / d12 - 0.25D;
        if (d13 >= 0.0D)
          break;
        float f = (float)(Math.sqrt(d12) / 1.99999D);
        paramFloat5 *= f;
        paramFloat6 *= f;
      }
      double d12 = Math.sqrt(d13);
      d8 *= d12;
      d9 *= d12;
      if (paramBoolean1 == paramBoolean2)
      {
        d10 -= d9;
        d11 = d8 + d11;
        label239: d5 = Math.atan2(d5 - d11, d4 - d10);
        d7 = Math.atan2(d7 - d11, d6 - d10) - d5;
        if (d7 < 0.0D)
          break label386;
        paramBoolean1 = true;
        label282: d6 = d7;
        if (paramBoolean2 != paramBoolean1)
          if (d7 <= 0.0D)
            break label392;
      }
      label386: label392: for (double d6 = d7 - 6.283185307179586D; ; d6 = d7 + 6.283185307179586D)
      {
        d10 *= paramFloat5;
        d11 = paramFloat6 * d11;
        a(paramPath, d10 * d2 - d11 * d3, d10 * d3 + d2 * d11, paramFloat5, paramFloat6, paramFloat1, paramFloat2, d1, d5, d6);
        break;
        d10 = d9 + d10;
        d11 -= d8;
        break label239;
        paramBoolean1 = false;
        break label282;
      }
    }

    private static void a(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
    {
      float f1 = paramArrayOfFloat1[0];
      float f2 = paramArrayOfFloat1[1];
      float f3 = paramArrayOfFloat1[2];
      float f4 = paramArrayOfFloat1[3];
      float f5 = paramArrayOfFloat1[4];
      float f6 = paramArrayOfFloat1[5];
      int i;
      int j;
      float f7;
      label226: float f8;
      float f9;
      float f10;
      switch (paramChar2)
      {
      default:
        i = 2;
        j = 0;
        f7 = f4;
        f4 = f1;
        f1 = f6;
        f6 = f3;
        f3 = f7;
        if (j < paramArrayOfFloat2.length)
          switch (paramChar2)
          {
          default:
            f7 = f1;
            f1 = f3;
            f3 = f2;
            f2 = f4;
            f4 = f3;
            f3 = f6;
            f6 = f5;
            f5 = f7;
          case 'm':
          case 'M':
          case 'l':
          case 'L':
          case 'h':
          case 'H':
          case 'v':
          case 'V':
          case 'c':
          case 'C':
          case 's':
          case 'S':
          case 'q':
          case 'Q':
          case 't':
          case 'T':
          case 'a':
          case 'A':
          }
        break;
      case 'Z':
      case 'z':
      case 'L':
      case 'M':
      case 'T':
      case 'l':
      case 'm':
      case 't':
      case 'H':
      case 'V':
      case 'h':
      case 'v':
      case 'C':
      case 'c':
      case 'Q':
      case 'S':
      case 'q':
      case 's':
      case 'A':
      case 'a':
        while (true)
        {
          j += i;
          f7 = f5;
          f5 = f6;
          f6 = f3;
          f8 = f4;
          f4 = f2;
          paramChar1 = paramChar2;
          f3 = f1;
          f1 = f7;
          f2 = f8;
          break label226;
          paramPath.close();
          paramPath.moveTo(f5, f6);
          f4 = f6;
          f3 = f5;
          f2 = f6;
          f1 = f5;
          i = 2;
          break;
          i = 2;
          break;
          i = 1;
          break;
          i = 6;
          break;
          i = 4;
          break;
          i = 7;
          break;
          f4 += paramArrayOfFloat2[(j + 0)];
          f2 = paramArrayOfFloat2[(j + 1)] + f2;
          if (j > 0)
          {
            paramPath.rLineTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
            f7 = f5;
            f9 = f3;
            f3 = f6;
            f8 = f2;
            f2 = f4;
            f5 = f1;
            f1 = f9;
            f6 = f7;
            f4 = f8;
          }
          else
          {
            paramPath.rMoveTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
            f5 = f2;
            f7 = f4;
            f1 = f3;
            f3 = f6;
            f8 = f2;
            f2 = f4;
            f6 = f7;
            f4 = f8;
            continue;
            f4 = paramArrayOfFloat2[(j + 0)];
            f2 = paramArrayOfFloat2[(j + 1)];
            if (j > 0)
            {
              paramPath.lineTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
              f7 = f5;
              f9 = f3;
              f3 = f6;
              f8 = f4;
              f5 = f1;
              f1 = f9;
              f6 = f7;
              f4 = f2;
              f2 = f8;
            }
            else
            {
              paramPath.moveTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
              f5 = f2;
              f7 = f4;
              f1 = f3;
              f3 = f6;
              f8 = f4;
              f6 = f7;
              f4 = f2;
              f2 = f8;
              continue;
              paramPath.rLineTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
              f9 = paramArrayOfFloat2[(j + 0)];
              f10 = paramArrayOfFloat2[(j + 1)];
              f7 = f5;
              f8 = f3;
              f3 = f6;
              f2 = f10 + f2;
              f9 = f4 + f9;
              f5 = f1;
              f1 = f8;
              f6 = f7;
              f4 = f2;
              f2 = f9;
              continue;
              paramPath.lineTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
              f7 = paramArrayOfFloat2[(j + 0)];
              f2 = paramArrayOfFloat2[(j + 1)];
              f4 = f5;
              f8 = f3;
              f3 = f6;
              f5 = f1;
              f1 = f8;
              f6 = f4;
              f4 = f2;
              f2 = f7;
              continue;
              paramPath.rLineTo(paramArrayOfFloat2[(j + 0)], 0.0F);
              f9 = paramArrayOfFloat2[(j + 0)];
              f7 = f5;
              f8 = f3;
              f3 = f6;
              f9 = f4 + f9;
              f5 = f1;
              f1 = f8;
              f6 = f7;
              f4 = f2;
              f2 = f9;
              continue;
              paramPath.lineTo(paramArrayOfFloat2[(j + 0)], f2);
              f9 = paramArrayOfFloat2[(j + 0)];
              f4 = f5;
              f8 = f3;
              f3 = f6;
              f7 = f2;
              f2 = f9;
              f5 = f1;
              f1 = f8;
              f6 = f4;
              f4 = f7;
              continue;
              paramPath.rLineTo(0.0F, paramArrayOfFloat2[(j + 0)]);
              f9 = paramArrayOfFloat2[(j + 0)];
              f7 = f5;
              f8 = f3;
              f3 = f6;
              f9 += f2;
              f2 = f4;
              f5 = f1;
              f1 = f8;
              f6 = f7;
              f4 = f9;
              continue;
              paramPath.lineTo(f4, paramArrayOfFloat2[(j + 0)]);
              f7 = paramArrayOfFloat2[(j + 0)];
              f2 = f5;
              f9 = f3;
              f3 = f6;
              f8 = f4;
              f5 = f1;
              f1 = f9;
              f6 = f2;
              f4 = f7;
              f2 = f8;
              continue;
              paramPath.rCubicTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)], paramArrayOfFloat2[(j + 4)], paramArrayOfFloat2[(j + 5)]);
              f3 = paramArrayOfFloat2[(j + 2)];
              f7 = paramArrayOfFloat2[(j + 3)];
              f8 = paramArrayOfFloat2[(j + 4)];
              f9 = paramArrayOfFloat2[(j + 5)];
              f6 = f5;
              f7 = f2 + f7;
              f3 = f4 + f3;
              f2 = f9 + f2;
              f8 = f4 + f8;
              f5 = f1;
              f1 = f7;
              f4 = f2;
              f2 = f8;
              continue;
              paramPath.cubicTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)], paramArrayOfFloat2[(j + 4)], paramArrayOfFloat2[(j + 5)]);
              f2 = paramArrayOfFloat2[(j + 4)];
              f4 = paramArrayOfFloat2[(j + 5)];
              f3 = paramArrayOfFloat2[(j + 2)];
              f7 = paramArrayOfFloat2[(j + 3)];
              f6 = f5;
              f5 = f1;
              f1 = f7;
              continue;
              f8 = 0.0F;
              f7 = 0.0F;
              if ((paramChar1 == 'c') || (paramChar1 == 's') || (paramChar1 == 'C') || (paramChar1 == 'S'))
              {
                f8 = f4 - f6;
                f7 = f2 - f3;
              }
              paramPath.rCubicTo(f8, f7, paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)]);
              f3 = paramArrayOfFloat2[(j + 0)];
              f7 = paramArrayOfFloat2[(j + 1)];
              f8 = paramArrayOfFloat2[(j + 2)];
              f9 = paramArrayOfFloat2[(j + 3)];
              f6 = f5;
              f7 = f2 + f7;
              f3 = f4 + f3;
              f2 = f9 + f2;
              f8 = f4 + f8;
              f5 = f1;
              f1 = f7;
              f4 = f2;
              f2 = f8;
            }
          }
        }
        if ((paramChar1 == 'c') || (paramChar1 == 's') || (paramChar1 == 'C') || (paramChar1 == 'S'))
        {
          f6 = 2.0F * f4 - f6;
          f2 = 2.0F * f2 - f3;
        }
        break;
      }
      while (true)
      {
        paramPath.cubicTo(f6, f2, paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)]);
        f3 = paramArrayOfFloat2[(j + 0)];
        f7 = paramArrayOfFloat2[(j + 1)];
        f2 = paramArrayOfFloat2[(j + 2)];
        f4 = paramArrayOfFloat2[(j + 3)];
        f6 = f5;
        f5 = f1;
        f1 = f7;
        break;
        paramPath.rQuadTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)]);
        f3 = paramArrayOfFloat2[(j + 0)];
        f7 = paramArrayOfFloat2[(j + 1)];
        f8 = paramArrayOfFloat2[(j + 2)];
        f9 = paramArrayOfFloat2[(j + 3)];
        f6 = f5;
        f7 = f2 + f7;
        f3 = f4 + f3;
        f2 = f9 + f2;
        f8 = f4 + f8;
        f5 = f1;
        f1 = f7;
        f4 = f2;
        f2 = f8;
        break;
        paramPath.quadTo(paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)], paramArrayOfFloat2[(j + 2)], paramArrayOfFloat2[(j + 3)]);
        f3 = paramArrayOfFloat2[(j + 0)];
        f7 = paramArrayOfFloat2[(j + 1)];
        f2 = paramArrayOfFloat2[(j + 2)];
        f4 = paramArrayOfFloat2[(j + 3)];
        f6 = f5;
        f5 = f1;
        f1 = f7;
        break;
        f7 = 0.0F;
        f8 = 0.0F;
        if ((paramChar1 == 'q') || (paramChar1 == 't') || (paramChar1 == 'Q') || (paramChar1 == 'T'))
        {
          f7 = f4 - f6;
          f8 = f2 - f3;
        }
        paramPath.rQuadTo(f7, f8, paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
        f9 = paramArrayOfFloat2[(j + 0)];
        f10 = paramArrayOfFloat2[(j + 1)];
        f6 = f5;
        f8 = f2 + f8;
        f3 = f4 + f7;
        f2 = f10 + f2;
        f7 = f4 + f9;
        f5 = f1;
        f1 = f8;
        f4 = f2;
        f2 = f7;
        break;
        if ((paramChar1 != 'q') && (paramChar1 != 't') && (paramChar1 != 'Q'))
        {
          f8 = f2;
          f7 = f4;
          if (paramChar1 != 'T');
        }
        else
        {
          f7 = 2.0F * f4 - f6;
          f8 = 2.0F * f2 - f3;
        }
        paramPath.quadTo(f7, f8, paramArrayOfFloat2[(j + 0)], paramArrayOfFloat2[(j + 1)]);
        f2 = paramArrayOfFloat2[(j + 0)];
        f4 = paramArrayOfFloat2[(j + 1)];
        f6 = f5;
        f3 = f7;
        f5 = f1;
        f1 = f8;
        break;
        f3 = paramArrayOfFloat2[(j + 5)];
        f7 = paramArrayOfFloat2[(j + 6)];
        f8 = paramArrayOfFloat2[(j + 0)];
        f9 = paramArrayOfFloat2[(j + 1)];
        f6 = paramArrayOfFloat2[(j + 2)];
        boolean bool1;
        if (paramArrayOfFloat2[(j + 3)] != 0.0F)
        {
          bool1 = true;
          label2239: if (paramArrayOfFloat2[(j + 4)] == 0.0F)
            break label2340;
        }
        label2340: for (boolean bool2 = true; ; bool2 = false)
        {
          a(paramPath, f4, f2, f3 + f4, f7 + f2, f8, f9, f6, bool1, bool2);
          f7 = f4 + paramArrayOfFloat2[(j + 5)];
          f4 = f2 + paramArrayOfFloat2[(j + 6)];
          f6 = f5;
          f8 = f4;
          f3 = f7;
          f2 = f7;
          f5 = f1;
          f1 = f8;
          break;
          bool1 = false;
          break label2239;
        }
        f3 = paramArrayOfFloat2[(j + 5)];
        f8 = paramArrayOfFloat2[(j + 6)];
        f6 = paramArrayOfFloat2[(j + 0)];
        f7 = paramArrayOfFloat2[(j + 1)];
        f9 = paramArrayOfFloat2[(j + 2)];
        if (paramArrayOfFloat2[(j + 3)] != 0.0F)
        {
          bool1 = true;
          label2407: if (paramArrayOfFloat2[(j + 4)] == 0.0F)
            break label2492;
        }
        label2492: for (bool2 = true; ; bool2 = false)
        {
          a(paramPath, f4, f2, f3, f8, f6, f7, f9, bool1, bool2);
          f2 = paramArrayOfFloat2[(j + 5)];
          f4 = paramArrayOfFloat2[(j + 6)];
          f6 = f5;
          f7 = f4;
          f3 = f2;
          f5 = f1;
          f1 = f7;
          break;
          bool1 = false;
          break label2407;
        }
        paramArrayOfFloat1[0] = f4;
        paramArrayOfFloat1[1] = f2;
        paramArrayOfFloat1[2] = f6;
        paramArrayOfFloat1[3] = f3;
        paramArrayOfFloat1[4] = f5;
        paramArrayOfFloat1[5] = f1;
        return;
        f6 = f4;
      }
    }

    public static void a(b[] paramArrayOfb, Path paramPath)
    {
      float[] arrayOfFloat = new float[6];
      char c1 = 'm';
      int i = 0;
      for (char c2 = c1; i < paramArrayOfb.length; c2 = c1)
      {
        a(paramPath, arrayOfFloat, c2, paramArrayOfb[i].Hc, paramArrayOfb[i].Hd);
        c1 = paramArrayOfb[i].Hc;
        i++;
      }
    }

    public final void a(b paramb1, b paramb2, float paramFloat)
    {
      for (int i = 0; i < paramb1.Hd.length; i++)
        this.Hd[i] = (paramb1.Hd[i] * (1.0F - paramFloat) + paramb2.Hd[i] * paramFloat);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.c
 * JD-Core Version:    0.6.2
 */