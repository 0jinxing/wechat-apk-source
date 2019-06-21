package android.support.constraint;

import android.os.Build.VERSION;

final class a$a
{
  public float alpha = 1.0F;
  public int bottomMargin = -1;
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
  boolean eN = false;
  int eO;
  public int eP = -1;
  public int eQ = -1;
  public boolean eR = false;
  public float eS = 0.0F;
  public float eT = 0.0F;
  public float eU = 0.0F;
  public float eV = (0.0F / 0.0F);
  public float eW = (0.0F / 0.0F);
  public float eX = 0.0F;
  public float eY = 0.0F;
  public float eZ = 0.0F;
  public int ec = 0;
  public int ed = 0;
  public int em = -1;
  public int eo = -1;
  public boolean ep = false;
  public boolean eq = false;
  public int fa = 0;
  public int fb = 0;
  public int fc = -1;
  public int fe = -1;
  public int ff = -1;
  public int fg = -1;
  public float fh = 1.0F;
  public float fi = 1.0F;
  public boolean fj = false;
  public int fk = -1;
  public int fl = -1;
  public int[] fn;
  public String fo;
  public float horizontalWeight = 0.0F;
  public int leftMargin = -1;
  public int mHeight;
  public int mWidth;
  public int orientation = -1;
  public int rightMargin = -1;
  public float rotation = 0.0F;
  public float scaleX = 1.0F;
  public float scaleY = 1.0F;
  public int topMargin = -1;
  public float verticalWeight = 0.0F;
  public int visibility = 0;

  final void a(int paramInt, Constraints.LayoutParams paramLayoutParams)
  {
    this.eO = paramInt;
    this.dB = paramLayoutParams.dB;
    this.dC = paramLayoutParams.dC;
    this.dD = paramLayoutParams.dD;
    this.dE = paramLayoutParams.dE;
    this.dF = paramLayoutParams.dF;
    this.dG = paramLayoutParams.dG;
    this.dH = paramLayoutParams.dH;
    this.dI = paramLayoutParams.dI;
    this.dJ = paramLayoutParams.dJ;
    this.dN = paramLayoutParams.dN;
    this.dO = paramLayoutParams.dO;
    this.dP = paramLayoutParams.dP;
    this.dQ = paramLayoutParams.dQ;
    this.dX = paramLayoutParams.dX;
    this.dY = paramLayoutParams.dY;
    this.dZ = paramLayoutParams.dZ;
    this.dK = paramLayoutParams.dK;
    this.dL = paramLayoutParams.dL;
    this.dM = paramLayoutParams.dM;
    this.em = paramLayoutParams.em;
    this.eo = paramLayoutParams.eo;
    this.orientation = paramLayoutParams.orientation;
    this.dA = paramLayoutParams.dA;
    this.dw = paramLayoutParams.dw;
    this.dz = paramLayoutParams.dz;
    this.mWidth = paramLayoutParams.width;
    this.mHeight = paramLayoutParams.height;
    this.leftMargin = paramLayoutParams.leftMargin;
    this.rightMargin = paramLayoutParams.rightMargin;
    this.topMargin = paramLayoutParams.topMargin;
    this.bottomMargin = paramLayoutParams.bottomMargin;
    this.verticalWeight = paramLayoutParams.verticalWeight;
    this.horizontalWeight = paramLayoutParams.horizontalWeight;
    this.ed = paramLayoutParams.ed;
    this.ec = paramLayoutParams.ec;
    this.ep = paramLayoutParams.ep;
    this.eq = paramLayoutParams.eq;
    this.fa = paramLayoutParams.ee;
    this.fb = paramLayoutParams.ef;
    this.ep = paramLayoutParams.ep;
    this.fc = paramLayoutParams.ei;
    this.fe = paramLayoutParams.ej;
    this.ff = paramLayoutParams.eg;
    this.fg = paramLayoutParams.eh;
    this.fh = paramLayoutParams.ek;
    this.fi = paramLayoutParams.el;
    if (Build.VERSION.SDK_INT >= 17)
    {
      this.eP = paramLayoutParams.getMarginEnd();
      this.eQ = paramLayoutParams.getMarginStart();
    }
    this.alpha = paramLayoutParams.alpha;
    this.rotation = paramLayoutParams.rotation;
    this.eT = paramLayoutParams.eT;
    this.eU = paramLayoutParams.eU;
    this.scaleX = paramLayoutParams.scaleX;
    this.scaleY = paramLayoutParams.scaleY;
    this.eV = paramLayoutParams.eV;
    this.eW = paramLayoutParams.eW;
    this.eX = paramLayoutParams.eX;
    this.eY = paramLayoutParams.eY;
    this.eZ = paramLayoutParams.eZ;
    this.eS = paramLayoutParams.eS;
    this.eR = paramLayoutParams.eR;
  }

  public final void a(ConstraintLayout.LayoutParams paramLayoutParams)
  {
    paramLayoutParams.dB = this.dB;
    paramLayoutParams.dC = this.dC;
    paramLayoutParams.dD = this.dD;
    paramLayoutParams.dE = this.dE;
    paramLayoutParams.dF = this.dF;
    paramLayoutParams.dG = this.dG;
    paramLayoutParams.dH = this.dH;
    paramLayoutParams.dI = this.dI;
    paramLayoutParams.dJ = this.dJ;
    paramLayoutParams.dN = this.dN;
    paramLayoutParams.dO = this.dO;
    paramLayoutParams.dP = this.dP;
    paramLayoutParams.dQ = this.dQ;
    paramLayoutParams.leftMargin = this.leftMargin;
    paramLayoutParams.rightMargin = this.rightMargin;
    paramLayoutParams.topMargin = this.topMargin;
    paramLayoutParams.bottomMargin = this.bottomMargin;
    paramLayoutParams.dV = this.dV;
    paramLayoutParams.dW = this.dW;
    paramLayoutParams.dX = this.dX;
    paramLayoutParams.dY = this.dY;
    paramLayoutParams.dK = this.dK;
    paramLayoutParams.dL = this.dL;
    paramLayoutParams.dM = this.dM;
    paramLayoutParams.dZ = this.dZ;
    paramLayoutParams.em = this.em;
    paramLayoutParams.eo = this.eo;
    paramLayoutParams.verticalWeight = this.verticalWeight;
    paramLayoutParams.horizontalWeight = this.horizontalWeight;
    paramLayoutParams.ed = this.ed;
    paramLayoutParams.ec = this.ec;
    paramLayoutParams.ep = this.ep;
    paramLayoutParams.eq = this.eq;
    paramLayoutParams.ee = this.fa;
    paramLayoutParams.ef = this.fb;
    paramLayoutParams.ei = this.fc;
    paramLayoutParams.ej = this.fe;
    paramLayoutParams.eg = this.ff;
    paramLayoutParams.eh = this.fg;
    paramLayoutParams.ek = this.fh;
    paramLayoutParams.el = this.fi;
    paramLayoutParams.orientation = this.orientation;
    paramLayoutParams.dA = this.dA;
    paramLayoutParams.dw = this.dw;
    paramLayoutParams.dz = this.dz;
    paramLayoutParams.width = this.mWidth;
    paramLayoutParams.height = this.mHeight;
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramLayoutParams.setMarginStart(this.eQ);
      paramLayoutParams.setMarginEnd(this.eP);
    }
    paramLayoutParams.validate();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a
 * JD-Core Version:    0.6.2
 */