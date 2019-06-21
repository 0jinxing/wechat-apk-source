package com.tencent.oscarcamera.particlesystem;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Particle
{
  public double[] a;
  public double birth;
  public int currFrame;
  public int frameCount;
  public boolean musicPlayed;
  public Particle next;
  int param_offset;
  public String tex;
  public int total;
  public double[] touchedPosition;

  public Particle()
  {
    AppMethodBeat.i(81511);
    this.musicPlayed = false;
    this.a = new double[10];
    this.touchedPosition = new double[3];
    this.next = null;
    this.total = 0;
    AppMethodBeat.o(81511);
  }

  void copy(Particle paramParticle)
  {
    if (paramParticle == null);
    while (true)
    {
      return;
      this.tex = paramParticle.tex;
      this.frameCount = paramParticle.frameCount;
      this.currFrame = paramParticle.currFrame;
      int i = this.a.length;
      for (int j = 0; j < i; j++)
        this.a[j] = paramParticle.a[j];
      this.touchedPosition[0] = paramParticle.touchedPosition[0];
      this.touchedPosition[1] = paramParticle.touchedPosition[1];
      this.touchedPosition[2] = paramParticle.touchedPosition[2];
    }
  }

  public String toString()
  {
    AppMethodBeat.i(81512);
    String str = String.format("(%f, %f, %f, %f, %f, %f, %f, %f, %f, %f, %d, %d)", new Object[] { Double.valueOf(this.a[2]), Double.valueOf(this.a[0]), Double.valueOf(this.a[1]), Double.valueOf(this.a[7]), Double.valueOf(this.a[8]), Double.valueOf(this.a[9]), Double.valueOf(this.a[3]), Double.valueOf(this.a[4]), Double.valueOf(this.a[5]), Double.valueOf(this.a[6]), Integer.valueOf(this.frameCount), Integer.valueOf(this.currFrame) });
    AppMethodBeat.o(81512);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.oscarcamera.particlesystem.Particle
 * JD-Core Version:    0.6.2
 */