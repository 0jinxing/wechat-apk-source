package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.a.a.f;
import android.support.constraint.a.a.i;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ConstraintLayout$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public float dA = -1.0F;
  public int dB = -1;
  public int dC = -1;
  public int dD = -1;
  public int dE = -1;
  public int dF = -1;
  public int dG = -1;
  public int dH = -1;
  public int dI = -1;
  public int dJ = -1;
  public int dK = -1;
  public int dL = 0;
  public float dM = 0.0F;
  public int dN = -1;
  public int dO = -1;
  public int dP = -1;
  public int dQ = -1;
  public int dR = -1;
  public int dS = -1;
  public int dT = -1;
  public int dU = -1;
  public int dV = -1;
  public int dW = -1;
  public float dX = 0.5F;
  public float dY = 0.5F;
  public String dZ = null;
  public int dw = -1;
  public int dz = -1;
  int eA = -1;
  int eB = -1;
  int eC = -1;
  float eD = 0.5F;
  int eE;
  int eF;
  float eG;
  f eH = new f();
  public boolean eI = false;
  float ea = 0.0F;
  int eb = 1;
  public int ec = 0;
  public int ed = 0;
  public int ee = 0;
  public int ef = 0;
  public int eg = 0;
  public int eh = 0;
  public int ei = 0;
  public int ej = 0;
  public float ek = 1.0F;
  public float el = 1.0F;
  public int em = -1;
  public int eo = -1;
  public boolean ep = false;
  public boolean eq = false;
  boolean er = true;
  boolean es = true;
  boolean et = false;
  boolean eu = false;
  boolean ev = false;
  boolean ew = false;
  int ex = -1;
  int ey = -1;
  int ez = -1;
  public float horizontalWeight = -1.0F;
  public int orientation = -1;
  public float verticalWeight = -1.0F;

  public ConstraintLayout$LayoutParams()
  {
    super(-2, -2);
  }

  public ConstraintLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b.a.ConstraintLayout_Layout);
    int i = paramContext.getIndexCount();
    int j = 0;
    if (j < i)
    {
      int k = paramContext.getIndex(j);
      switch (ConstraintLayout.LayoutParams.a.eJ.get(k))
      {
      case 0:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      default:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 2:
      case 3:
      case 4:
      case 49:
      case 50:
      case 5:
      case 6:
      case 7:
      case 1:
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
      case 29:
      case 30:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 27:
      case 28:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      }
      while (true)
      {
        j++;
        break;
        this.dB = paramContext.getResourceId(k, this.dB);
        if (this.dB == -1)
        {
          this.dB = paramContext.getInt(k, -1);
          continue;
          this.dC = paramContext.getResourceId(k, this.dC);
          if (this.dC == -1)
          {
            this.dC = paramContext.getInt(k, -1);
            continue;
            this.dD = paramContext.getResourceId(k, this.dD);
            if (this.dD == -1)
            {
              this.dD = paramContext.getInt(k, -1);
              continue;
              this.dE = paramContext.getResourceId(k, this.dE);
              if (this.dE == -1)
              {
                this.dE = paramContext.getInt(k, -1);
                continue;
                this.dF = paramContext.getResourceId(k, this.dF);
                if (this.dF == -1)
                {
                  this.dF = paramContext.getInt(k, -1);
                  continue;
                  this.dG = paramContext.getResourceId(k, this.dG);
                  if (this.dG == -1)
                  {
                    this.dG = paramContext.getInt(k, -1);
                    continue;
                    this.dH = paramContext.getResourceId(k, this.dH);
                    if (this.dH == -1)
                    {
                      this.dH = paramContext.getInt(k, -1);
                      continue;
                      this.dI = paramContext.getResourceId(k, this.dI);
                      if (this.dI == -1)
                      {
                        this.dI = paramContext.getInt(k, -1);
                        continue;
                        this.dJ = paramContext.getResourceId(k, this.dJ);
                        if (this.dJ == -1)
                        {
                          this.dJ = paramContext.getInt(k, -1);
                          continue;
                          this.dK = paramContext.getResourceId(k, this.dK);
                          if (this.dK == -1)
                          {
                            this.dK = paramContext.getInt(k, -1);
                            continue;
                            this.dL = paramContext.getDimensionPixelSize(k, this.dL);
                            continue;
                            this.dM = (paramContext.getFloat(k, this.dM) % 360.0F);
                            if (this.dM < 0.0F)
                            {
                              this.dM = ((360.0F - this.dM) % 360.0F);
                              continue;
                              this.em = paramContext.getDimensionPixelOffset(k, this.em);
                              continue;
                              this.eo = paramContext.getDimensionPixelOffset(k, this.eo);
                              continue;
                              this.dw = paramContext.getDimensionPixelOffset(k, this.dw);
                              continue;
                              this.dz = paramContext.getDimensionPixelOffset(k, this.dz);
                              continue;
                              this.dA = paramContext.getFloat(k, this.dA);
                              continue;
                              this.orientation = paramContext.getInt(k, this.orientation);
                              continue;
                              this.dN = paramContext.getResourceId(k, this.dN);
                              if (this.dN == -1)
                              {
                                this.dN = paramContext.getInt(k, -1);
                                continue;
                                this.dO = paramContext.getResourceId(k, this.dO);
                                if (this.dO == -1)
                                {
                                  this.dO = paramContext.getInt(k, -1);
                                  continue;
                                  this.dP = paramContext.getResourceId(k, this.dP);
                                  if (this.dP == -1)
                                  {
                                    this.dP = paramContext.getInt(k, -1);
                                    continue;
                                    this.dQ = paramContext.getResourceId(k, this.dQ);
                                    if (this.dQ == -1)
                                    {
                                      this.dQ = paramContext.getInt(k, -1);
                                      continue;
                                      this.dR = paramContext.getDimensionPixelSize(k, this.dR);
                                      continue;
                                      this.dS = paramContext.getDimensionPixelSize(k, this.dS);
                                      continue;
                                      this.dT = paramContext.getDimensionPixelSize(k, this.dT);
                                      continue;
                                      this.dU = paramContext.getDimensionPixelSize(k, this.dU);
                                      continue;
                                      this.dV = paramContext.getDimensionPixelSize(k, this.dV);
                                      continue;
                                      this.dW = paramContext.getDimensionPixelSize(k, this.dW);
                                      continue;
                                      this.dX = paramContext.getFloat(k, this.dX);
                                      continue;
                                      this.dY = paramContext.getFloat(k, this.dY);
                                      continue;
                                      this.dZ = paramContext.getString(k);
                                      this.ea = (0.0F / 0.0F);
                                      this.eb = -1;
                                      if (this.dZ != null)
                                      {
                                        int m = this.dZ.length();
                                        k = this.dZ.indexOf(',');
                                        if ((k > 0) && (k < m - 1))
                                        {
                                          paramAttributeSet = this.dZ.substring(0, k);
                                          if (paramAttributeSet.equalsIgnoreCase("W"))
                                          {
                                            this.eb = 0;
                                            label1484: k++;
                                          }
                                        }
                                        float f1;
                                        float f2;
                                        while (true)
                                        {
                                          while (true)
                                          {
                                            int n = this.dZ.indexOf(':');
                                            if ((n < 0) || (n >= m - 1))
                                              break label1649;
                                            String str = this.dZ.substring(k, n);
                                            paramAttributeSet = this.dZ.substring(n + 1);
                                            if ((str.length() <= 0) || (paramAttributeSet.length() <= 0))
                                              break;
                                            try
                                            {
                                              f1 = Float.parseFloat(str);
                                              f2 = Float.parseFloat(paramAttributeSet);
                                              if ((f1 <= 0.0F) || (f2 <= 0.0F))
                                                break;
                                              if (this.eb != 1)
                                                break label1630;
                                              this.ea = Math.abs(f2 / f1);
                                            }
                                            catch (NumberFormatException paramAttributeSet)
                                            {
                                            }
                                          }
                                          break;
                                          if (!paramAttributeSet.equalsIgnoreCase("H"))
                                            break label1484;
                                          this.eb = 1;
                                          break label1484;
                                          k = 0;
                                        }
                                        label1630: f1 /= f2;
                                        this.ea = Math.abs(f1);
                                        continue;
                                        label1649: paramAttributeSet = this.dZ.substring(k);
                                        if (paramAttributeSet.length() > 0)
                                        {
                                          try
                                          {
                                            this.ea = Float.parseFloat(paramAttributeSet);
                                          }
                                          catch (NumberFormatException paramAttributeSet)
                                          {
                                          }
                                          continue;
                                          this.horizontalWeight = paramContext.getFloat(k, this.horizontalWeight);
                                          continue;
                                          this.verticalWeight = paramContext.getFloat(k, this.verticalWeight);
                                          continue;
                                          this.ec = paramContext.getInt(k, 0);
                                          continue;
                                          this.ed = paramContext.getInt(k, 0);
                                          continue;
                                          this.ep = paramContext.getBoolean(k, this.ep);
                                          continue;
                                          this.eq = paramContext.getBoolean(k, this.eq);
                                          continue;
                                          this.ee = paramContext.getInt(k, 0);
                                          if (this.ee == 1)
                                          {
                                            continue;
                                            this.ef = paramContext.getInt(k, 0);
                                            if (this.ef == 1)
                                            {
                                              continue;
                                              try
                                              {
                                                this.eg = paramContext.getDimensionPixelSize(k, this.eg);
                                              }
                                              catch (Exception paramAttributeSet)
                                              {
                                              }
                                              if (paramContext.getInt(k, this.eg) == -2)
                                              {
                                                this.eg = -2;
                                                continue;
                                                try
                                                {
                                                  this.ei = paramContext.getDimensionPixelSize(k, this.ei);
                                                }
                                                catch (Exception paramAttributeSet)
                                                {
                                                }
                                                if (paramContext.getInt(k, this.ei) == -2)
                                                {
                                                  this.ei = -2;
                                                  continue;
                                                  this.ek = Math.max(0.0F, paramContext.getFloat(k, this.ek));
                                                  continue;
                                                  try
                                                  {
                                                    this.eh = paramContext.getDimensionPixelSize(k, this.eh);
                                                  }
                                                  catch (Exception paramAttributeSet)
                                                  {
                                                  }
                                                  if (paramContext.getInt(k, this.eh) == -2)
                                                  {
                                                    this.eh = -2;
                                                    continue;
                                                    try
                                                    {
                                                      this.ej = paramContext.getDimensionPixelSize(k, this.ej);
                                                    }
                                                    catch (Exception paramAttributeSet)
                                                    {
                                                    }
                                                    if (paramContext.getInt(k, this.ej) == -2)
                                                    {
                                                      this.ej = -2;
                                                      continue;
                                                      this.el = Math.max(0.0F, paramContext.getFloat(k, this.el));
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
    paramContext.recycle();
    validate();
  }

  public ConstraintLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  @TargetApi(17)
  public void resolveLayoutDirection(int paramInt)
  {
    int i = 0;
    int j = this.leftMargin;
    int k = this.rightMargin;
    super.resolveLayoutDirection(paramInt);
    this.ez = -1;
    this.eA = -1;
    this.ex = -1;
    this.ey = -1;
    this.eB = -1;
    this.eC = -1;
    this.eB = this.dR;
    this.eC = this.dT;
    this.eD = this.dX;
    this.eE = this.dw;
    this.eF = this.dz;
    this.eG = this.dA;
    label128: label321: if (1 == getLayoutDirection())
    {
      paramInt = 1;
      if (paramInt == 0)
        break label442;
      if (this.dN == -1)
        break label359;
      this.ez = this.dN;
      paramInt = 1;
      if (this.dP != -1)
      {
        this.ey = this.dP;
        paramInt = 1;
      }
      if (this.dQ != -1)
      {
        this.ex = this.dQ;
        paramInt = 1;
      }
      if (this.dV != -1)
        this.eC = this.dV;
      if (this.dW != -1)
        this.eB = this.dW;
      if (paramInt != 0)
        this.eD = (1.0F - this.dX);
      if ((this.eu) && (this.orientation == 1))
      {
        if (this.dA == -1.0F)
          break label382;
        this.eG = (1.0F - this.dA);
        this.eE = -1;
        this.eF = -1;
      }
      label255: if ((this.dP == -1) && (this.dQ == -1) && (this.dO == -1) && (this.dN == -1))
      {
        if (this.dD == -1)
          break label541;
        this.ez = this.dD;
        if ((this.rightMargin <= 0) && (k > 0))
          this.rightMargin = k;
        if (this.dB == -1)
          break label578;
        this.ex = this.dB;
        if ((this.leftMargin <= 0) && (j > 0))
          this.leftMargin = j;
      }
    }
    while (true)
    {
      return;
      paramInt = 0;
      break;
      label359: paramInt = i;
      if (this.dO == -1)
        break label128;
      this.eA = this.dO;
      paramInt = 1;
      break label128;
      label382: if (this.dw != -1)
      {
        this.eF = this.dw;
        this.eE = -1;
        this.eG = -1.0F;
        break label255;
      }
      if (this.dz == -1)
        break label255;
      this.eE = this.dz;
      this.eF = -1;
      this.eG = -1.0F;
      break label255;
      label442: if (this.dN != -1)
        this.ey = this.dN;
      if (this.dO != -1)
        this.ex = this.dO;
      if (this.dP != -1)
        this.ez = this.dP;
      if (this.dQ != -1)
        this.eA = this.dQ;
      if (this.dV != -1)
        this.eB = this.dV;
      if (this.dW == -1)
        break label255;
      this.eC = this.dW;
      break label255;
      label541: if (this.dE == -1)
        break label321;
      this.eA = this.dE;
      if ((this.rightMargin > 0) || (k <= 0))
        break label321;
      this.rightMargin = k;
      break label321;
      label578: if (this.dC != -1)
      {
        this.ey = this.dC;
        if ((this.leftMargin <= 0) && (j > 0))
          this.leftMargin = j;
      }
    }
  }

  public final void validate()
  {
    this.eu = false;
    this.er = true;
    this.es = true;
    if ((this.width == -2) && (this.ep))
    {
      this.er = false;
      this.ee = 1;
    }
    if ((this.height == -2) && (this.eq))
    {
      this.es = false;
      this.ef = 1;
    }
    if ((this.width == 0) || (this.width == -1))
    {
      this.er = false;
      if ((this.width == 0) && (this.ee == 1))
      {
        this.width = -2;
        this.ep = true;
      }
    }
    if ((this.height == 0) || (this.height == -1))
    {
      this.es = false;
      if ((this.height == 0) && (this.ef == 1))
      {
        this.height = -2;
        this.eq = true;
      }
    }
    if ((this.dA != -1.0F) || (this.dw != -1) || (this.dz != -1))
    {
      this.eu = true;
      this.er = true;
      this.es = true;
      if (!(this.eH instanceof i))
        this.eH = new i();
      ((i)this.eH).setOrientation(this.orientation);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.constraint.ConstraintLayout.LayoutParams
 * JD-Core Version:    0.6.2
 */