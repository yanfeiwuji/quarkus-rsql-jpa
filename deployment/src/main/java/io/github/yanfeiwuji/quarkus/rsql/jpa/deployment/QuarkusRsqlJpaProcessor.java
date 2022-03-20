package io.github.yanfeiwuji.quarkus.rsql.jpa.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusRsqlJpaProcessor {

    private static final String FEATURE = "quarkus-rsql-jpa";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
