package com.google.android.exoplayer2.f.a;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.f.h;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a extends d
{
  private static final int[] Pc = { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
  private static final int[] blo = { 11, 1, 3, 12, 14, 5, 7, 9 };
  private static final int[] blp = { 0, 4, 8, 12, 16, 20, 24, 28 };
  private static final int[] blq = { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
  private static final int[] blr = { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
  private static final int[] bls = { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
  private static final int[] blt = { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
  private List<com.google.android.exoplayer2.f.a> blA;
  private int blB;
  private int blC;
  private boolean blD;
  private byte blE;
  private byte blF;
  private final l blu;
  private final int blv;
  private final int blw;
  private final LinkedList<a> blx;
  private a bly;
  private List<com.google.android.exoplayer2.f.a> blz;

  public a(String paramString, int paramInt)
  {
    AppMethodBeat.i(95570);
    this.blu = new l();
    this.blx = new LinkedList();
    this.bly = new a(0, 4);
    int i;
    if ("application/x-mp4-cea-608".equals(paramString))
    {
      i = 2;
      this.blv = i;
      switch (paramInt)
      {
      default:
      case 3:
      case 4:
      }
    }
    for (this.blw = 1; ; this.blw = 2)
    {
      eu(0);
      sO();
      AppMethodBeat.o(95570);
      return;
      i = 3;
      break;
    }
  }

  private static char b(byte paramByte)
  {
    return (char)blq[((paramByte & 0x7F) - 32)];
  }

  private void eu(int paramInt)
  {
    AppMethodBeat.i(95575);
    if (this.blB == paramInt)
      AppMethodBeat.o(95575);
    while (true)
    {
      return;
      int i = this.blB;
      this.blB = paramInt;
      sO();
      if ((i == 3) || (paramInt == 1) || (paramInt == 0))
        this.blz = null;
      AppMethodBeat.o(95575);
    }
  }

  private List<com.google.android.exoplayer2.f.a> sN()
  {
    AppMethodBeat.i(95574);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.blx.size(); i++)
    {
      com.google.android.exoplayer2.f.a locala = ((a)this.blx.get(i)).sU();
      if (locala != null)
        localArrayList.add(locala);
    }
    AppMethodBeat.o(95574);
    return localArrayList;
  }

  private void sO()
  {
    AppMethodBeat.i(95576);
    this.bly.reset(this.blB, this.blC);
    this.blx.clear();
    this.blx.add(this.bly);
    AppMethodBeat.o(95576);
  }

  protected final void a(h paramh)
  {
    AppMethodBeat.i(95573);
    this.blu.n(paramh.aEY.array(), paramh.aEY.limit());
    int i = 0;
    int j = 0;
    label384: label398: label418: label567: 
    while (this.blu.tB() >= this.blv)
    {
      if (this.blv == 2);
      int m;
      int n;
      for (int k = -4; ; k = (byte)this.blu.readUnsignedByte())
      {
        m = (byte)(this.blu.readUnsignedByte() & 0x7F);
        n = (byte)(this.blu.readUnsignedByte() & 0x7F);
        if (((k & 0x6) != 4) || ((this.blw == 1) && ((k & 0x1) != 0)) || ((this.blw == 2) && ((k & 0x1) != 1)) || ((m == 0) && (n == 0)))
          break;
        if (((m & 0xF7) != 17) || ((n & 0xF0) != 48))
          break label189;
        this.bly.append((char)blr[(n & 0xF)]);
        j = 1;
        break;
      }
      label189: if (((m & 0xF6) == 18) && ((n & 0xE0) == 32))
      {
        this.bly.sR();
        if ((m & 0x1) == 0)
        {
          this.bly.append((char)bls[(n & 0x1F)]);
          j = 1;
        }
        else
        {
          this.bly.append((char)blt[(n & 0x1F)]);
          j = 1;
        }
      }
      else
      {
        if ((m & 0xE0) == 0)
        {
          if ((m & 0xF0) == 16)
            j = 1;
          while (true)
            if (j != 0)
            {
              if ((this.blD) && (this.blE == m) && (this.blF == n))
              {
                this.blD = false;
                j = 1;
                k = 1;
                i = j;
                j = k;
                break;
                j = 0;
                continue;
              }
              this.blD = true;
              this.blE = m;
              this.blF = n;
            }
          if (((m & 0xF7) == 17) && ((n & 0xF0) == 32))
          {
            i = 1;
            if (i == 0)
              break label543;
            if ((n & 0x1) != 1)
              break label472;
            i = 1;
            paramh = this.bly;
            if (i == 0)
              break label477;
            paramh.blL = paramh.blJ.length();
            i = n >> 1 & 0xF;
            if (i != 7)
              break label520;
            this.bly.a(new StyleSpan(2), 2);
            this.bly.a(new ForegroundColorSpan(-1), 1);
          }
          while (true)
          {
            label464: break;
            i = 0;
            break label384;
            label472: i = 0;
            break label398;
            label477: if (paramh.blL == -1)
              break label418;
            paramh.blJ.setSpan(new UnderlineSpan(), paramh.blL, paramh.blJ.length(), 33);
            paramh.blL = -1;
            break label418;
            this.bly.a(new ForegroundColorSpan(Pc[i]), 1);
            continue;
            int i1;
            if (((m & 0xF0) == 16) && ((n & 0xC0) == 64))
            {
              i = 1;
              if (i == 0)
                break label800;
              i1 = blo[(m & 0x7)];
              if ((n & 0x20) == 0)
                break label754;
            }
            label754: for (k = 1; ; k = 0)
            {
              i = i1;
              if (k != 0)
                i = i1 + 1;
              if (i != this.bly.row)
              {
                if ((this.blB != 1) && (!this.bly.isEmpty()))
                {
                  this.bly = new a(this.blB, this.blC);
                  this.blx.add(this.bly);
                }
                this.bly.row = i;
              }
              if ((n & 0x1) == 1)
                this.bly.a(new UnderlineSpan());
              i = n >> 1 & 0xF;
              if (i > 7)
                break label782;
              if (i != 7)
                break label760;
              this.bly.a(new StyleSpan(2));
              this.bly.a(new ForegroundColorSpan(-1));
              break;
              i = 0;
              break label567;
            }
            label760: this.bly.a(new ForegroundColorSpan(Pc[i]));
            continue;
            this.bly.aLM = blp[(i & 0x7)];
            continue;
            if (((m & 0xF7) == 23) && (n >= 33) && (n <= 35));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label851;
              this.bly.blK = (n - 32);
              break;
            }
            label851: if (((m & 0xF7) == 20) && ((n & 0xF0) == 32));
            for (i = 1; i != 0; i = 0)
              switch (n)
              {
              case 33:
              case 34:
              case 35:
              case 36:
              case 40:
              default:
                if (this.blB == 0)
                  break label464;
                switch (n)
                {
                default:
                  break;
                case 33:
                  this.bly.sR();
                  break;
                case 44:
                case 46:
                case 47:
                case 45:
                }
                break;
              case 37:
              case 38:
              case 39:
              case 32:
              case 41:
              }
            this.blC = 2;
            eu(1);
            continue;
            this.blC = 3;
            eu(1);
            continue;
            this.blC = 4;
            eu(1);
            continue;
            eu(2);
            continue;
            eu(3);
            continue;
            this.blz = null;
            if ((this.blB == 1) || (this.blB == 3))
            {
              sO();
              continue;
              sO();
              continue;
              this.blz = sN();
              sO();
              continue;
              if ((this.blB == 1) && (!this.bly.isEmpty()))
                this.bly.sS();
            }
          }
        }
        this.bly.append(b(m));
        if ((n & 0xE0) != 0)
          this.bly.append(b(n));
        j = 1;
      }
    }
    label520: label543: label800: if (j != 0)
    {
      if (i == 0)
        this.blD = false;
      if ((this.blB == 1) || (this.blB == 3))
        this.blz = sN();
    }
    label782: AppMethodBeat.o(95573);
  }

  public final void flush()
  {
    AppMethodBeat.i(95571);
    super.flush();
    this.blz = null;
    this.blA = null;
    eu(0);
    sO();
    this.blC = 4;
    this.blD = false;
    this.blE = ((byte)0);
    this.blF = ((byte)0);
    AppMethodBeat.o(95571);
  }

  public final void release()
  {
  }

  protected final boolean sL()
  {
    if (this.blz != this.blA);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final com.google.android.exoplayer2.f.d sM()
  {
    AppMethodBeat.i(95572);
    this.blA = this.blz;
    f localf = new f(this.blz);
    AppMethodBeat.o(95572);
    return localf;
  }

  static final class a
  {
    int aLM;
    private int blB;
    private int blC;
    private final List<CharacterStyle> blG;
    private final List<a.a.a> blH;
    private final List<SpannableString> blI;
    final SpannableStringBuilder blJ;
    int blK;
    int blL;
    int row;

    public a(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(95559);
      this.blG = new ArrayList();
      this.blH = new ArrayList();
      this.blI = new LinkedList();
      this.blJ = new SpannableStringBuilder();
      reset(paramInt1, paramInt2);
      AppMethodBeat.o(95559);
    }

    private SpannableString sT()
    {
      AppMethodBeat.i(95567);
      int i = this.blJ.length();
      for (int j = 0; j < this.blG.size(); j++)
        this.blJ.setSpan(this.blG.get(j), 0, i, 33);
      j = 0;
      if (j < this.blH.size())
      {
        localObject = (a.a.a)this.blH.get(j);
        if (j < this.blH.size() - ((a.a.a)localObject).blN);
        for (int k = ((a.a.a)this.blH.get(((a.a.a)localObject).blN + j)).start; ; k = i)
        {
          this.blJ.setSpan(((a.a.a)localObject).blM, ((a.a.a)localObject).start, k, 33);
          j++;
          break;
        }
      }
      if (this.blL != -1)
        this.blJ.setSpan(new UnderlineSpan(), this.blL, i, 33);
      Object localObject = new SpannableString(this.blJ);
      AppMethodBeat.o(95567);
      return localObject;
    }

    public final void a(CharacterStyle paramCharacterStyle)
    {
      AppMethodBeat.i(95564);
      this.blG.add(paramCharacterStyle);
      AppMethodBeat.o(95564);
    }

    public final void a(CharacterStyle paramCharacterStyle, int paramInt)
    {
      AppMethodBeat.i(95565);
      this.blH.add(new a.a.a(paramCharacterStyle, this.blJ.length(), paramInt));
      AppMethodBeat.o(95565);
    }

    public final void append(char paramChar)
    {
      AppMethodBeat.i(95566);
      this.blJ.append(paramChar);
      AppMethodBeat.o(95566);
    }

    public final boolean isEmpty()
    {
      AppMethodBeat.i(95561);
      boolean bool;
      if ((this.blG.isEmpty()) && (this.blH.isEmpty()) && (this.blI.isEmpty()) && (this.blJ.length() == 0))
      {
        bool = true;
        AppMethodBeat.o(95561);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(95561);
      }
    }

    public final void reset(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(95560);
      this.blG.clear();
      this.blH.clear();
      this.blI.clear();
      this.blJ.clear();
      this.row = 15;
      this.aLM = 0;
      this.blK = 0;
      this.blB = paramInt1;
      this.blC = paramInt2;
      this.blL = -1;
      AppMethodBeat.o(95560);
    }

    public final void sR()
    {
      AppMethodBeat.i(95562);
      int i = this.blJ.length();
      if (i > 0)
        this.blJ.delete(i - 1, i);
      AppMethodBeat.o(95562);
    }

    public final void sS()
    {
      AppMethodBeat.i(95563);
      this.blI.add(sT());
      this.blJ.clear();
      this.blG.clear();
      this.blH.clear();
      this.blL = -1;
      int i = Math.min(this.blC, this.row);
      while (this.blI.size() >= i)
        this.blI.remove(0);
      AppMethodBeat.o(95563);
    }

    public final com.google.android.exoplayer2.f.a sU()
    {
      int i = 2;
      AppMethodBeat.i(95568);
      Object localObject = new SpannableStringBuilder();
      for (int j = 0; j < this.blI.size(); j++)
      {
        ((SpannableStringBuilder)localObject).append((CharSequence)this.blI.get(j));
        ((SpannableStringBuilder)localObject).append('\n');
      }
      ((SpannableStringBuilder)localObject).append(sT());
      if (((SpannableStringBuilder)localObject).length() == 0)
      {
        localObject = null;
        AppMethodBeat.o(95568);
        return localObject;
      }
      int k = this.aLM + this.blK;
      int m = 32 - k - ((SpannableStringBuilder)localObject).length();
      j = k - m;
      float f;
      if ((this.blB == 2) && (Math.abs(j) < 3))
      {
        f = 0.5F;
        j = 1;
        label137: if ((this.blB != 1) && (this.row <= 7))
          break label248;
        m = this.row - 15 - 2;
      }
      while (true)
      {
        localObject = new com.google.android.exoplayer2.f.a((CharSequence)localObject, Layout.Alignment.ALIGN_NORMAL, m, 1, i, f, j, 1.4E-45F);
        AppMethodBeat.o(95568);
        break;
        if ((this.blB == 2) && (j > 0))
        {
          f = (32 - m) / 32.0F * 0.8F + 0.1F;
          j = 2;
          break label137;
        }
        f = k / 32.0F * 0.8F + 0.1F;
        j = 0;
        break label137;
        label248: m = this.row;
        i = 0;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(95569);
      String str = this.blJ.toString();
      AppMethodBeat.o(95569);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.a
 * JD-Core Version:    0.6.2
 */