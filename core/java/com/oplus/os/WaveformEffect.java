package com.oplus.os;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class WaveformEffect implements Parcelable {
    public static final Parcelable.Creator<WaveformEffect> CREATOR = new Parcelable.Creator<WaveformEffect>() { // from class: com.oplus.os.WaveformEffect.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaveformEffect createFromParcel(Parcel parcel) {
            return new WaveformEffect(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaveformEffect[] newArray(int i) {
            return new WaveformEffect[i];
        }
    };
    private boolean mEffectLoop;
    private int mEffectType;
    private boolean mStrengthSettingEnabled;

    private WaveformEffect() {
        this.mEffectType = -1;
        this.mEffectLoop = false;
        this.mStrengthSettingEnabled = false;
    }

    public int getEffectType() {
        return this.mEffectType;
    }

    public boolean getEffectLoop() {
        return this.mEffectLoop;
    }

    public boolean getStrengthSettingEnabled() {
        return this.mStrengthSettingEnabled;
    }

    /* loaded from: classes5.dex */
    public static class Builder {
        private int mEffectType = -1;
        private boolean mEffectLoop = false;
        private boolean mStrengthSettingEnabled = false;

        public Builder() {
        }

        public Builder(WaveformEffect waveformEffect) {
        }

        public WaveformEffect build() {
            WaveformEffect waveformEffect = new WaveformEffect();
            waveformEffect.mEffectType = this.mEffectType;
            waveformEffect.mEffectLoop = this.mEffectLoop;
            waveformEffect.mStrengthSettingEnabled = this.mStrengthSettingEnabled;
            return waveformEffect;
        }

        public Builder setEffectType(int i) {
            this.mEffectType = i;
            return this;
        }

        public Builder setEffectLoop(boolean z) {
            this.mEffectLoop = z;
            return this;
        }

        public Builder setStrengthSettingEnabled(boolean z) {
            this.mStrengthSettingEnabled = z;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mEffectType);
        parcel.writeBoolean(this.mEffectLoop);
        parcel.writeBoolean(this.mStrengthSettingEnabled);
    }

    private WaveformEffect(Parcel parcel) {
        this.mEffectType = parcel.readInt();
        this.mEffectLoop = parcel.readBoolean();
        this.mStrengthSettingEnabled = parcel.readBoolean();
    }

    public String toString() {
        return "{mEffectType=" + this.mEffectType + ", mEffectLoop=" + this.mEffectLoop + ", mStrengthSettingEnabled=" + this.mStrengthSettingEnabled + "}";
    }
}
