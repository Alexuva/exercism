class AnnalynsInfiltration {
    
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) return false;
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake || knightIsAwake || prisonerIsAwake) return true;
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake) return true;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            if (!archerIsAwake) return true;
        } else {
            if (prisonerIsAwake && !archerIsAwake && !knightIsAwake) return true;
        }

        return false;
    }
    
}
